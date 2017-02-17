CREATE USER 'taskit_user'@'%' IDENTIFIED BY '!r0ys1ngh4M';
CREATE DATABASE taskit;
GRANT ALL privileges ON *.* TO 'taskit_user'@'%' with grant option;
flush privileges;