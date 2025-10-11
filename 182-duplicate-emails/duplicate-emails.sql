select distinct P.email from Person as P join Person as Q
where P.email=Q.email and P.id<>Q.id