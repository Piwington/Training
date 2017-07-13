SELECT movieid, group_concat(tag) FROM tags GROUP BY movieid ORDER BY movieid
