-- Last updated: 12/08/2026, 11:48:22
SELECT p.firstName, 
       p.lastName, 
       a.city, 
       a.state
FROM Person p
LEFT JOIN Address a
  ON p.personId = a.personId;

