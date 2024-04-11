SELECT COUNT(*) AS fish_count, MONTH(time) as month
FROM fish_info
GROUP BY month
ORDER BY month