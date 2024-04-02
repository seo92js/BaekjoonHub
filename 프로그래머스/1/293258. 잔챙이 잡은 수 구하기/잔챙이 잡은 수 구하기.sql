SELECT COUNT(id) AS fish_count
FROM fish_info
WHERE length <= 10 OR length IS NULL