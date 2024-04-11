SELECT COUNT(*) AS fish_count, fish_name_info.fish_name AS fish_name
FROM fish_name_info
JOIN fish_info ON fish_name_info.fish_type = fish_info.fish_type
GROUP BY fish_name
ORDER BY fish_count DESC