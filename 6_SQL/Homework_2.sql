# 1. Создать БД vk, исполнив скрипт _vk_db_creation.sql (в материалах к уроку).
# Запускаем скрипт из материалов к уроку.

# 2. Написать скрипт, добавляющий в созданную БД vk 2-3 новые таблицы 
#    (с перечнем полей, указанием индексов и внешних ключей) (CREATE TABLE).
DROP TABLE IF EXISTS `albums`;
CREATE TABLE `albums` (
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
	name varchar(255),
	user_id bigint unsigned not null,
	time_creation timestamp,
	
    FOREIGN KEY (user_id) REFERENCES users(id)
    );

DROP TABLE IF EXISTS `photos`;
CREATE TABLE `photos` (
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
	link varchar(255),
	description varchar(255),
	album_id BIGINT UNSIGNED NOT NULL,
	time_creation timestamp,
	
    FOREIGN KEY (album_id) REFERENCES albums(id),
    INDEX photo_description_idx(description)
    );
   
# 3. Заполнить 2 таблицы БД vk данными (по 10 записей в каждой таблице) (INSERT).
INSERT INTO `vk`.`users` VALUES
	(1, 'Никола', 'Тесла','tesla@mail.ru','qwerty', 89271234567),
	(2, 'Альберт', 'Эйнштейн','einstein@mail.ru','qwerty', 89271234234),
	(3, 'Макс', 'Планк','plank@mail.ru','qwerty', 89271239785),
	(4, 'Эдвин', 'Хаббл','habbl@mail.ru','qwerty', 89271231235),
	(5, 'Александр', 'Белл','bell@mail.ru','qwerty', 89271237645),
	(6, 'Мария', 'Кюри','kuri@mail.ru','qwerty', 89271231122),
	(7, 'Стивен', 'Хоккинг','hocking@mail.ru','qwerty', 89271231113),
	(8, 'Томас', 'Эдисон','edison@mail.ru','qwerty', 89271239099),
	(9, 'Дмитрий', 'Менделеев','mendeleev@mail.ru','qwerty', 89271230000),
	(10, 'Чарльз', 'Дарвин','darvin@mail.ru','qwerty', 89271237777);


INSERT INTO `vk`.`communities` VALUES
	(1, 'Будущее энергетики', 1),
	(2, 'Всё относительно', 2),
	(3, 'Квантовая физика', 3),
	(4, 'Космос сегодня', 4),
	(5, 'Телефон это не роскошь', 5),
	(6, 'Свечение элементов', 6),
	(7, 'Космос завтра', 7),
	(8, 'Лампочки оптом', 8),
	(9, 'Химия и жизнь', 9),
	(10, 'Обезьяна > Человек', 10);

# 4. * Написать скрипт, отмечающий несовершеннолетних пользователей как неактивных 
#      (поле is_active = true). 
#      При необходимости предварительно добавить такое поле в таблицу profiles 
#      со значением по умолчанию = false (или 0) (ALTER TABLE + UPDATE).
# добавим флаг is_active 
ALTER TABLE vk.profiles 
ADD COLUMN is_active BIT DEFAULT 1;

# сделать невовершеннолетних неактивными
UPDATE profiles
SET is_active = 0
WHERE (birthday + INTERVAL 18 YEAR) > NOW();

# проверим не активных
select *
from profiles
where is_active = 0
order by birthday;

# проверим активных
select *
from profiles
where is_active = 1
order by birthday;
