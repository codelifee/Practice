create or replace procedure sel_gu
(
    vname out gu.g_name%type,
    vtitle out gu.g_title%type,
    vcont out gu.g_cont%type,
    vno in gu.g_no%type
)
is
begin
    select g_name, g_title, g_cont into vname, vtitle, vcont from gu where g_no=vno;
end;
/
