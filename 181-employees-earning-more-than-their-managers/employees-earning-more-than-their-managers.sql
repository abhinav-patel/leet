# Write your MySQL query statement below
select E.name as Employee from Employee as E, Employee as F where E.managerId=F.id and E.salary>F.salary