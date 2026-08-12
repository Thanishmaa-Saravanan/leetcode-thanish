-- Last updated: 12/08/2026, 11:48:20
SELECT s.score,
       (SELECT COUNT(DISTINCT score) 
        FROM Scores 
        WHERE score >= s.score) AS `rank`
FROM Scores s
ORDER BY s.score DESC;




