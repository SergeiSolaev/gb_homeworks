# 1. Написать скрипт, возвращающий список имен (только firstname) пользователей без повторений в алфавитном порядке. [ORDER BY]
SELECT DISTINCT firstname 
FROM users 
ORDER BY firstname 

# 2. Выведите количество мужчин старше 35 лет [COUNT].
SELECT COUNT(*) 
FROM profiles 
WHERE gender = 'm' AND TIMESTAMPDIFF(YEAR, birthday, NOW()) > 35

# 3. Сколько заявок в друзья в каждом статусе? (таблица friend_requests) [GROUP BY]
select COUNT(*) as amount, status 
from friend_requests
group by status

# 4. * Выведите номер пользователя, который отправил больше всех заявок в друзья (таблица friend_requests) [LIMIT].
SELECT COUNT(*), initiator_user_id 
FROM friend_requests
GROUP BY initiator_user_id 
LIMIT 1

# 5. * Выведите названия и номера групп, имена которых состоят из 5 символов [LIKE].
SELECT id, name 
FROM communities 
WHERE name LIKE '_____'