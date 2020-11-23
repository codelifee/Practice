--created table
create table gu(
	g_no number(38) primary key,
	g_name varchar2(50) not null,
	g_title varchar2(200),
	g_cont varchar2(1000),
	g_hit number(38) default 0,
	g_date date
);

select * from gu;

--created sequence
create sequence gno_seq
start with 1
increment by 1
nocache;

select gno_seq.nextval from dual; 
-- dual is the basic table which consist of one column.
-- it is used for calculation, function

insert into gu (g_no,g_name,g_title,g_cont,g_date) values(gno_seq.nextval,'su','su','su',sysdate);

select * from gu order by g_no desc;

update gu set g_name='modified name', g_title='modified title', g_cont='modified content' where g_no=3;

select g_name, g_title, g_cont from gu where g_no=3;

delete from gu where g_no=2;

select * from all_tables where USER='week7';

select * from gu;