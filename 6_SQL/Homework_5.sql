# 1. Создайте представление с произвольным SELECT-запросом из прошлых уроков [CREATE VIEW]
CREATE VIEW users_names AS
	SELECT *
	FROM users 
	WHERE firstname LIKE '_____';

# 2. Выведите данные, используя написанное представление [SELECT]
SELECT *
FROM users_names 
WHERE id < 20

# 3. Удалите представление [DROP VIEW]
DROP VIEW users_names;

# 4. * Сколько новостей (записей в таблице media) у каждого пользователя? 
#      Вывести поля: news_count (количество новостей), user_id (номер пользователя), 
#      user_email (email пользователя). 
#	   Попробовать решить с помощью CTE или с помощью обычного JOIN.

# решение с помощью CTE
WITH cte1 AS (
	SELECT COUNT(*) AS news_count, user_id
	FROM media
	GROUP BY user_id 
	)
SELECT news_count, user_id, email AS user_email
FROM cte1
JOIN users ON users.id = cte1.user_id

# решение с помощью JOIN
SELECT COUNT(*) AS news_count, user_id, email AS user_email
FROM media
JOIN users ON media.user_id = users.id 
GROUP BY user_id 