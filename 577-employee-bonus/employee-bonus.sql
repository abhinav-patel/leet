select E.name,B.bonus 
from Employee as E left join Bonus as B on E.empId=B.empId
where b.bonus<1000 or b.bonus is NULL;
