SELECT FI.ID, NIT.FISH_NAME, NIT.LENGTH
FROM (
        SELECT FT.FISH_TYPE AS FISH_TYPE, FN.FISH_NAME AS FISH_NAME, FT.ML AS LENGTH
        FROM (
            SELECT FISH_TYPE, MAX(LENGTH) AS ML
            FROM FISH_INFO
            GROUP BY FISH_TYPE
            ) FT 
            JOIN
            FISH_NAME_INFO FN 
            ON FT.FISH_TYPE=FN.FISH_TYPE
    ) NIT
    JOIN
    (
        SELECT ID, FISH_TYPE, LENGTH
        FROM FISH_INFO
    ) FI
    ON NIT.FISH_TYPE=FI.FISH_TYPE AND NIT.LENGTH=FI.LENGTH
ORDER BY FI.ID