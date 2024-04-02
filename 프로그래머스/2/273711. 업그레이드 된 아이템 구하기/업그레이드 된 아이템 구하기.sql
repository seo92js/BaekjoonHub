SELECT parent.item_id, parent.item_name, parent.rarity
FROM item_info AS parent
INNER JOIN item_tree ON parent.item_id = item_tree.item_id
INNER JOIN item_info AS child ON item_tree.parent_item_id = child.item_id
WHERE child.rarity = "RARE"
AND item_tree.parent_item_id IS NOT NULL
ORDER BY item_id DESC 