FROM mysql:latest
ADD init_db.sql /docker-entrypoint-initdb.d/sample.sql

LABEL Descripttion="This image is build for MAC to use mysql"
RUN apt-get update
RUN apt-get -y install vim
RUN usermod -u 1000 mysql
RUN mkdir -p /var/run/mysqld
RUN chmod -R 777 /var/run/mysqld
