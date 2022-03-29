--Listar a data de nascimento e o endere�o dos empregados com nome: John B Smith
select bdate, address 
	from employee where fname='John' and minit='B' and 	lname='Smith';

--Listar o nome e endere�o dos empregados que trabalham no departamento *Research'
SELECT e.fname, e.minit, e.lname, e.address
	FROM employee e, department d
		WHERE e.dno=d.dnumber AND d.dname= 'Research';
		
--Para todo projeto localizado em *Stafford', listar o n�mero do projeto, o n�mero do departamento que o controla e o �ltimo nome, endere�o e data de nascimento do gerente do departamento.
SELECT p.pnumber, p.dnum, e.lname, e.address, e.bdate
	FROM project p, department d, employee e
	WHERE p.plocation='Stafford'
	AND p.dnum=d.dnumber
	AND e.ssn=d.mgrssn;

--Listar o nome e endere�o dos empregados que trabalham no departamento *Research? considerando os novos esquemas
SELECT e.fname, e.minit, e.lname, e.address
	FROM employee e, department d
	WHERE e.dno = d.dnumber
	AND d.dname ='Research';

--Para cada empregado, liste o seu primeiro e o seu �ltimo nome acompanhados do �ltimo nome de seu supervisor.
SELECT e.fname "Emp Nome", e.lname "Emp Sobrenome", s.lname "Supervisor"
	FROM employee AS e, employee AS s
	WHERE e.superssn =s.ssn;

--Listar o nome e o endere�o dos empregados que trabalham no departamento *Research? considerando as novas tabelas employee e department e usando apelidos
SELECT e.fname, e.minit, e.lname, e.address
	FROM employee e, department d
	WHERE e.dno=d.dnumber
	AND d.dname ='Research';

-- Listar o produto cartesiano de empregados e departamentos
SELECT *
	FROM employee e, department d;

--Listar todos os sal�rios distintos
SELECT DISTINCT e.salary
	FROM employee e;

--Listar os n�meros dos projetos que envolvam um empregado cujo �ltimo nome � *Wong? sendo que o empregado deve ser trabalhador ou gerente do departamento que controla o projeto.
(select distinct p.pnumber
	from project p, department d, employee e
	where p.dnum=d.dnumber and d.mgrssn = e.ssn and e.lname='Wong')
	union
	(select distinct wo.pno
		from works_on wo, employee e
		where wo.essn = e.ssn and e.lname = 'Wong');

--Listar o nome de todo empregado cujo endere�o est� em Houston, Texas
SELECT e.fname, e.minit, e.lname
	FROM employee e
	WHERE e.address LIKE '%Houston%TX%';

--Listar o nome de todos os empregados nascidos na d�cada de 50
SELECT e.fname, e.minit, e.lname
	FROM employee e
	WHERE CAST(e.bdate AS TEXT) LIKE '__6%';

--Listar o nome e os sal�rios resultantes de um aumento de 10% para os funcion�rios do projeto 'Productx'
SELECT e.fname, e.minit, e.lname, e.salary*1.1 AS NewSalary
	FROM employee e, project p, works_on wo
	WHERE e.ssn=wo.essn AND wo.pno=p.pnumber
	AND p.pname='ProductX';

--Listar todos os empregados no departamento 5 cujo sal�rio est� entre 30000 e 40000
SELECT *
	FROM employee e
	WHERE e.dno='5'
	AND e.salary BETWEEN 30000 AND 40000;

--Listar os empregados e projetos em que eles est�o trabalhando, ordenados pelo departamento e, dentro de cada departamento, ordenado pelo �ltimo e primeiro nome
SELECT e.dno, e.fname, e.lname, wo.pno 
	FROM employee e, works_on wo 
	WHERE wo.essn=e.ssn 
	ORDER BY e.dno, e.fname, e.lname;

SELECT e.dno, d.dname , e.fname, e.lname, wo.pno, p.pname 
	FROM employee e, works_on wo, department d, project p 
	WHERE wo.essn=e.ssn and wo.pno = p.pnumber and e.dno = d.dnumber 
	ORDER BY e.dno, e.fname, e.lname;

-- Listar a soma de sal�rios, o maior sal�rio e a m�dia de sal�rios, somente para funcion�rios do departamento 'Research'
SELECT SUM(salary), MAX(salary), MIN(salary), AVG(salary)
	FROM employee, department
	WHERE dno=dnumber 
	AND dname='Research';

--Listar o n�mero de sal�rios distintos
SELECT COUNT(DISTINCT salary)
	FROM employee;

-- Listar o nome dos empregados que t�m dois ou mais dependentes
SELECT fname, lname
	FROM employee
	WHERE (SELECT COUNT(*)
		FROM dependent
		WHERE essn=ssn) >= 2;
	
-- Listar para cada departamento seu n�mero, a quantidade de empregados e a m�dia salarial de seus empregados.
SELECT dnumber, COUNT(*), AVG(salary)
	FROM department, employee
	WHERE dno=dnumber
	GROUP BY dnumber;

-- Listar para cada projeto seu n�mero, nome e a quantidade de empregados que trabalham no projeto.
SELECT pnumber, pname, COUNT(*)
	FROM project, works_on
	WHERE pno=pnumber
	GROUP BY pnumber, pname;

-- Listar para cada projeto onde trabalham mais de dois empregados seu n�mero e a quantidade de empregados que trabalham no projeto
SELECT pnumber, pname, COUNT(*)
	FROM project, works_on
	WHERE pno=pnumber
	GROUP BY pnumber, pname
	HAVING COUNT (*)> 2;

-- Listar para cada departamento que tem mais que 2 empregados, o n�mero do departamento e o n�mero de empregados que ganham mais que 40000
SELECT dno, COUNT(*)
	FROM employee
	WHERE salary > 40000
	AND dno IN
		(SELECT dnumber 
			FROM department
			WHERE(SELECT COUNT(*)
				FROM employee e2
				WHERE e2 .dno=dnumber)>2)
				GROUP BY dno;
			
--Consultas Simples - SQL/DML � Consultas Aninhadas
-- Listar todos os n�meros de projetos que envolvam um empregado cujo �ltimo nome � �Smith� sendo que o empregado deve ser trabalhador ou gerente do departamento que controla o projeto.
(SELECT pnumber
	FROM project, department, employee
	WHERE dnum=dnumber 
	AND mgrssn=ssn AND lname='Smith')
	UNION
		(SELECT pnumber 
			FROM project, works_on, employee
			WHERE pno=pnumber AND essn=ssn AND lname='Smith')
			
-- Reformulando a consulta, removendo a cl�usula UNION e incluindo a cl�usula IN
SELECT DISTINCT pnumber 
	FROM project
	WHERE pnumber 
	IN (SELECT pnumber
		FROM project, department, employee
		WHERE dnum=dnumber
		AND mgrssn=ssn
		AND lname='Smith')
		OR pnumber
		IN (SELECT pno
			FROM works_on, employee
			WHERE essn=ssn AND lname='Smith')
			order by pnumber;
		
-- Listar o nome dos empregados com dependente(s) de mesmo �first name� e sexo que o empregado � usando sub-consulta
SELECT e.fname,e.lname
	FROM employee as e
	WHERE e.ssn IN
	(SELECT essn
		FROM dependent as d
		WHERE fname=dependent_name
		AND e.sex=d.sex);

-- Substituindo sub-consulta por join (produto cartesiano)
SELECT e.fname,e.lname
	FROM employee as e, dependent as d
	WHERE e.ssn=d.essn
	AND e.fname=d.dependent_name
	AND e.sex=d.sex;

-- Listar os nomes de empregados sem dependentes
SELECT fname,lname
	FROM employee
	WHERE NOT EXISTS (SELECT *
		FROM dependent
		WHERE ssn=essn);
	
-- Listar o nome dos empregados que trabalham em todos os projetos controlados pelo departamento n�mero 4 � divis�o de duplas nega��o
SELECT lname, fname, dno  
	FROM employee
	WHERE NOT EXISTS
	(SELECT * 
		FROM project 
		WHERE dnum=4
		AND NOT EXISTS
		(SELECT *
			FROM works_on
			WHERE essn=ssn
			AND pnumber=pno));
		
-- Mesma consulta - divis�o nega��o e subtra��o
SELECT lname, fname 
	FROM employee e
	WHERE NOT EXISTS
	(SELECT pnumber
		FROM project
		WHERE dnum=4
		EXCEPT
		(SELECT pno FROM works_on w
			WHERE w.essn=e.ssn));
		
--Consultas Simples - SQL/DML � Join e Agrega��o
-- Listar o nome e endere�o dos empregados que trabalham no departamento �Research�
-- JOIN ? INNER JOIN � � a mesma coisa
SELECT fname, minit, lname, address, dname 
	FROM (employee JOIN department ON dno=dnumber)
	WHERE dname='Research';

-- Listar o nome e endere�o dos empregados que trabalham no departamento �Research�
-- Na jun��o natural iguala-se, de forma impl�cita, os atributos de mesmo nome.
SELECT fname, lname, address
	FROM employee NATURAL JOIN department 
	WHERE dname='Research';

-- Para cada empregado, liste o seu primeiro acompanhado do primeiro nome de seu supervisor, mesmo se o empregado n�o tiver supervisor, liste seu nome
SELECT e.fname as employee_name, s.fname as supervisor_name
	FROM (employee AS e
	left OUTER JOIN employee AS s
	ON e.superssn =s.ssn);

-- Liste o primeiro nome do supervisor e o primeiro nome de seus supervisionado, ordenado pelo primeiro. Mesmo se o empregado n�o for supervisor de ningu�m, liste seu nome na primeira coluna e mesmo se o empregado n�o tiver supervisor, liste seu nome na segunda coluna.
SELECT s.fname as supervisor_name, e.fname as employee_name
	FROM (employee AS e
	FULL OUTER JOIN employee AS s
	ON e.superssn =s.ssn)
	ORDER BY 1;

--Para todo projeto localizado em �Stafford�, listar o n�mero do projeto, o n�mero do departamento que o controla e o �ltimo nome do gerente do departamento
SELECT pnumber, dnum, lname
	FROM ((project JOIN department ON dnum=dnumber)
	JOIN employee ON mgrssn=ssn)
	WHERE plocation = 'Stafford';
	

--Estudo de procedure

create function BuscaSalario(nome text)
returns numeric(10,2) AS $$
declare 
	valor numeric(10,2) :=0;
begin
	select e.salary into valor  
	from employee e 
	where e.fname = $1;
	return valor;
end;

$$ language plpgsql;

select  BuscaSalario('Alicia');
