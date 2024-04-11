SELECT users.user_id, users.nickname, SUM(price) AS total_sales
FROM used_goods_user AS users
JOIN used_goods_board AS board ON users.user_id =  board.writer_id
WHERE board.status = 'done'
GROUP BY users.user_id
HAVING total_sales >= 700000
ORDER BY total_sales