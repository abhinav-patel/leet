select p.firstName,p.lastName,A.city,A.state from Person as p left join Address as A on p.personid=A.personId
