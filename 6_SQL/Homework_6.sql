#1. Написать функцию, которая удаляет всю информацию об указанном пользователе из БД vk. 
#   Пользователь задается по id. Удалить нужно все сообщения, лайки, 
#	медиа записи, профиль и запись из таблицы . 
#	Функция должна возвращать номер пользователя.

DROP FUNCTION IF EXISTS vk.del_user;

DELIMITER $$
$$
CREATE FUNCTION vk.del_user(del_user_id BIGINT UNSIGNED)
RETURNS BIGINT UNSIGNED READS SQL DATA
BEGIN
	DELETE FROM profiles
	WHERE user_id = del_user_id;
	DELETE FROM likes
	WHERE user_id = del_user_id;
	DELETE FROM media
	WHERE user_id = del_user_id;
	DELETE FROM messages
	WHERE from_user_id = del_user_id
	OR to_user_id = del_user_id;
	DELETE FROM users_communities
	WHERE user_id = del_user_id;
	DELETE FROM friend_requests
	WHERE initiator_user_id = del_user_id
	OR target_user_id = del_user_id;
	DELETE FROM users
	WHERE id = del_user_id;
	RETURN del_user_id;
END
$$
DELIMITER ;
  
SELECT del_user(21);

#2. Предыдущую задачу решить с помощью процедуры и обернуть используемые команды в транзакцию 
#	внутри процедуры.

DROP PROCEDURE IF EXISTS vk.delete_user;

DELIMITER $$
$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `vk`.`delete_user`(IN del_user_id BIGINT UNSIGNED)
BEGIN
    START TRANSACTION;
	  DELETE FROM profiles
	  WHERE user_id = del_user_id ;
	  DELETE FROM likes
	  WHERE user_id = del_user_id ;
	  DELETE FROM media
	  WHERE user_id = del_user_id;
	  DELETE FROM messages
	  WHERE from_user_id = del_user_id
	  OR to_user_id = del_user_id;
	  DELETE FROM users_communities
	  WHERE user_id = del_user_id;
	  DELETE FROM friend_requests
	  WHERE initiator_user_id = del_user_id
	  OR target_user_id = del_user_id;
	  DELETE FROM users
	  WHERE id = del_user_id;
    COMMIT;
    SELECT del_user_id;

  END$$
DELIMITER ;

CALL delete_user(21);


#3. * Написать триггер, который проверяет новое появляющееся сообщество. 
#     Длина названия сообщества (поле name) должна быть не менее 5 символов. 
#     Если требование не выполнено, то выбрасывать исключение с пояснением.
USE vk;
DROP TRIGGER IF EXISTS check_new_community_name;
DELIMITER $$

CREATE TRIGGER check_new_community_name BEFORE INSERT ON communities
FOR EACH ROW
BEGIN
	IF CHAR_LENGTH(NEW.name) < 5 THEN
		SIGNAL SQLSTATE '45000' 
		SET MESSAGE_TEXT = 'Обновление отменено. Длина имени сообщества должна быть не менее 5 символов.';
    END IF;
END$$

DELIMITER ;

INSERT INTO communities (name)
VALUES ('new');