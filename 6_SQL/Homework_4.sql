# 1. Подсчитать количество групп (сообществ), в которые вступил каждый пользователь.
SELECT id, firstname, lastname, COUNT(community_id) AS group_count
FROM users
JOIN users_communities ON users.id = users_communities.user_id 
GROUP BY id
ORDER BY id

# 2. Подсчитать количество пользователей в каждом сообществе.
SELECT community_id, name as community_name, COUNT(user_id) AS users_count
FROM users_communities
LEFT JOIN communities on users_communities.community_id = communities.id
GROUP BY community_id

# 3. Пусть задан некоторый пользователь. 
#	 Из всех пользователей соц. сети найдите человека, 
#	 который больше всех общался с выбранным пользователем (написал ему сообщений).

SELECT id, firstname, lastname
FROM users
WHERE id = (
	SELECT from_user_id
	FROM users
	JOIN messages ON users.id = messages.to_user_id 
	WHERE users.id = 1                               # задаём некоторого пользователя
	GROUP BY from_user_id 
	ORDER BY COUNT(from_user_id) DESC
	LIMIT 1)
