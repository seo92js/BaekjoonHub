SELECT COUNT(id) AS fish_count
FROM fish_info
WHERE 
fish_type IN 
    (SELECT fish_type 
     FROM fish_name_info 
     WHERE fish_name IN ('BASS', 'SNAPPER'))
