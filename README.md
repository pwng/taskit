# taskit

This is sample application that demonstrates how to use react and spring boot.

The application is a simple task management


## Setting up MySQL
These are the installation notes for Mac.
Download MySQL community server.
During the installation, the installer will inform you the root password
root password: -qkZPjqsO2/J (in my case)

Set the alias for mysql and mysqladmin
```
alias mysql=/usr/local/mysql/bin/mysql
alias mysqladmin=/usr/local/mysql/bin/mysqladmin
```

Get into mysql
```
mysql -u root -p
```

Reset the passwords and create the required database
```
ALTER USER 'root'@'localhost' IDENTIFIED BY 'abcdefg';
CREATE USER 'pwng'@'localhost' IDENTIFIED BY 'abcdefg';
GRANT ALL PRIVILEGES ON * . * TO 'pwng'@'localhost';
SELECT user,host from USER;
CREATE database taskit;
```
## Compiling the React front end

Install the required npm modules
```
npm install babel-core
npm i babel-loader babel-preset-es2015 babel-preset-react -S
npm install react --save
npm install react-dom --save
npm install react-router --save
npm install webpack
```

compile the js application
```
npm run webpack
```
