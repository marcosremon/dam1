set/p nombre=¿Nombre de usuario?
set/p password=¿Password?
"C:\Program Files\MySQL\MySQL Server 8.1\bin\mysql" -u  %nombre%  -p%password%
pause