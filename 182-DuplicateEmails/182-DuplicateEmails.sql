-- Last updated: 12/08/2026, 11:48:11
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;

