#2手机号sql脱敏
UPDATE person set tel_phone = CONCAT(LEFT(tel_phone,3), '*****' ,RIGHT(tel_phone,3));
#3查询各部门人数
SELECT e.`name`,COUNT(p.id)
FROM dept e ,person p
WHERE e.id = p.dept_id 
GROUP BY e.id;
（左连接）
SELECT e.`name`,COUNT(p.id)
FROM dept e left join person p
on e.id = p.dept_id 
GROUP BY e.id;
#4查询每个部门年龄最大的员工
SELECT d.`name`,p.name,u2.age FROM person p,dept d,
(SELECT person.dept_id,MAX(person.age) AS age FROM `person` GROUP BY person.dept_id) u2
WHERE p.dept_id=u2.dept_id AND p.age=u2.age AND p.`dept_id` = d.`id`


#5手机号模糊查询
SELECT * FROM person WHERE tel_phone LIKE '%789%'