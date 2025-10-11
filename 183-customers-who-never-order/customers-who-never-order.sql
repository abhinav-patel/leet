# Write your MySQL query statement below
select C1.name as Customers from Customers as C1 left join Orders as C2
on C1.id=C2.customerID where C2.customerId is null;