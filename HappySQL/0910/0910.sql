SHOW TABLES;
SELECT * FROM emp;

-- SELECT 컬럼명(, 컬럼명) FROM 테이블명(, 테이블명)
-- SELECT 2 + 3 FROM dual; 오라클

SELECT 4 + 5;
SELECT version(); -- () 함수 DBMS가 편하게 사용하라고 함수를 미리 제공하고 있다.

-- SQL 표준이 정해져있음. DBMS마다 조금씩 다른 부분이 있다.

-- 여러 줄에 걸쳐 쿼리를 사용하는 것도 문제가 없다. 문장과 문장은 ';'으로 구분된다.
SELECT
	3
		+
			5
				;
SELECT current_date;

DESC emp; -- 테이블의 구조를 확인한다.

SELECT * FROM emp;
SELECT job FROM emp;
SELECT DISTINCT job FROM emp;
SELECT DISTINCT job, empno from emp;

SELECT job, empno FROM emp;
SELECT empno 사번, ename AS '사원 이름', mgr AS 매니저 FROM emp;

SELECT ename, sal * 12 '연봉' from emp;

-- 조건에 만족하는 데이터만 보고싶다면? WHERE
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp WHERE job = 'manager'; -- ''안에 들어와 있는 것
SELECT * FROM emp WHERE sal > 2500;
SELECT * FROM emp WHERE sal > 2500 AND job = 'manager';

-- IN은 OR 결합
SELECT * FROM emp
WHERE deptno = 10 OR deptno = 20 OR deptno = 30;

SELECT * FROM emp
WHERE deptno in(10, 20, 30);

SELECT * FROM emp
WHERE deptno NOT IN (10, 40);

-- BETWEEN 앞쪽 값이 작은 값이 나와야 한다.
SELECT * FROM emp WHERE sal BETWEEN 2300 AND 3000;

SELECT * FROM emp WHERE hiredate BETWEEN '1981-01-01' AND '1981-12-31';

SELECT * FROM emp WHERE ename = 'FORD';

-- 와일드카드 '%'는 모든이라는 의미 흔히 사용하는 '*'과 같다. 0개도 포함된다..
-- 와일드카드 '_'는 딱 한글자를 의미한다.

-- 이름의 두번째 글자가 O인 사람 조회
SELECT * FROM emp WHERE ename LIKE '_O%';

SELECT * FROM emp WHERE hiredate LIKE '1981%';

-- NULL
SELECT * FROM emp WHERE comm IS NULL;

SELECT ename, sal, comm, sal + comm 급여 FROM emp;

-- NULL과 연산은 불가하기 때문에 값의 대체가 필요하다.
SELECT IFNULL(comm, 100) from emp;

SELECT ename, sal, comm, sal + IFNULL(comm, 100) 급여 FROM emp;

-- COALESCE: 앞에서부터 NULL이 아닌 값 반환, 모든 값이 NULL이면 가장 마지막 값 반환
SELECT ename, COALESCE(comm, job, '빈값') FROM emp;

DESC emp;
SELECT empno, ename, job, mgr, sal FROM emp;
SELECT empno, ename, job, mgr, sal FROM emp
ORDER BY ename;
SELECT empno, ename, job, mgr, sal FROM emp
ORDER BY ename desc;

SELECT empno, ename, job, mgr, sal, deptno FROM emp
ORDER BY 5, 2;
SELECT empno, ename, job, mgr, sal, deptno FROM emp
ORDER BY deptno, 5 desc;

SELECT empno, ename, sal * 12 연봉 FROM emp
ORDER BY 연봉;
SELECT empno, ename, sal * 12 연봉 FROM emp
ORDER BY 3 LIMIT 5;

-- 문자열 함수
SELECT UPPER('hello'), LOWER('HELLO');
SELECT * FROM emp WHERE LOWER(job) = 'manager';
SELECT SUBSTRING('Hello World', 1, 5);

-- 숫자 함수
SELECT ROUND(3.7);

-- 날짜 함수
SELECT DATEDIFF('2024-12-31', NOW());

-- 오늘 날짜와 시간
SELECT NOW();

-- 올해가 몇 년도인지, 이번달이 몇 월인지, 오늘이 며칠인지 구해보세요.
SELECT YEAR(NOW()) 년, MONTH(NOW()) 월, DAY(NOW()) 일;

-- 오늘부터 200일 뒤의 날짜를 구하세요.
SELECT DATE_ADD(NOW(), INTERVAL 200 DAY) '200일 뒤';

-- 2025년 8월 13일부터 며칠 지났는지 구하세요.
SELECT DATEDIFF('2025-08-13', NOW()) '지난 날짜';

-- 오늘 날짜를 2025년 09월 10일 과 같은 형태로 출력하세요.
SELECT DATE_FORMAT(NOW(), '%Y년 %m월 %d일') 오늘;

-- 단일행 함수 / 그룹함수
SELECT COUNT(ename) FROM emp; -- 그룹함수와 일반 컬럼은 같이 나올 수 없다.
SELECT COUNT(comm) FROM emp; -- count 할 때, NULL이 아닌 것만 한다.
SELECT COUNT(*) FROM emp;

SELECT SUM(sal) FROM emp;

SELECT AVG(sal) FROM emp;

-- 부서별 급여 평균
SELECT deptno, AVG(sal) FROM emp
GROUP BY deptno; -- 그룹핑에 참여한 컬럼은 컬럼절에 나올 수 있다.
-- 부서별, 직무별 급여 평균
SELECT deptno, job, AVG(sal) FROM emp
GROUP BY deptno, job
ORDER BY 1, 2;

-- 조건 WHERE: 전체에 대한 조건
-- 조건 HAVING: 그룹핑된 결과에 대한 조건

-- 10번 부서를 제외한 모든 사원의 부서별, 직무별 평균 긍벼. 단, 평균 급여가 3000 이상인 결과는 제외
SELECT deptno, job, AVG(sal) 평균급여
FROM emp
WHERE deptno != 10
GROUP BY deptno, job
HAVING 평균급여 < 3000
ORDER BY 1, 2;

desc emp;
desc dept;

SELECT * FROM emp;

-- 컬럼명 나열
SELECT ename, sal, dname FROM emp, dept;
SELECT ename, sal, dept.deptno, dname FROM emp, dept;

-- 명확하게 컬럼명 앞에 테이블을 명시하는 것이 좋다.
SELECT e.ename, e.sal, d.deptno, d.dname FROM emp e, dept d;

-- 조인 조건이 없으면, 모든 가능한 쌍이 다 나온다. CROSS JOIN
-- 따라서 조인 조건이 필요하다.
SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno;

-- NATURAL JOIN
SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e NATURAL JOIN dept d;

-- ANSI JOIN
SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e JOIN dept d USING(deptno);

SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e JOIN dept d ON e.deptno = d.deptno;

-- AND를 이용해서 조인조건 외 다른 조건을 사용할 수 있다.
SELECT e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND e.deptno = 20;

SELECT e.ename, e.sal, ddeptempsalgradedept.deptno, d.dname
FROM emp e JOIN dept ON e.deptno = d.deptno
WHERE e.deptno = 20;