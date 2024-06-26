WITH CNT_TABLE AS (
    SELECT COUNT(PARENT_ID) AS "CHILD_COUNT", PARENT_ID
    FROM ECOLI_DATA
    GROUP BY PARENT_ID
), ID_TABLE AS (
    SELECT ID 
    FROM ECOLI_DATA
)
SELECT ID, IFNULL(CHILD_COUNT, 0) AS "CHILD_COUNT"
FROM CNT_TABLE RIGHT JOIN ID_TABLE ON PARENT_ID=ID
ORDER BY ID