![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/09180dca-f373-480e-a584-191a96cbe65a)# GYM MANAGERMENT
  + This project will built a gym managerment system which the main goal is to serve customers.
# IDE use:
  + netbeans 8.2
# JAR Dependencies:
  + Download Microsoft JDBC Driver 12.4 for SQL Server (zip)  
  + Download-sql-server-2019
# Setting up the database:
  + Create a database named GYMMANAGERMENT  
  + Run the "use GYMMANAGERMENT" line  
  + Run all table in the sql  
  + Run Insert Into  
# Setting project in netbeans:
  + Step 1: Right click on Database -> New Connection -> Add -> add mssql-jdbc-12.4.1-jre11.jar
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/97b00da2-200d-41c9-a5fb-d06232343a1d)  
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/4f5fd162-7faf-495e-bf7c-5afea4db4180)
  + Step 2:Click on Next button
    + At Database line is your the project name in sql.Example: Above I have a name database is GYMMANAGERMENT  
    + At User Name and Password line, it is your usename and password in sqlserver  
    + At The JDBC URL, you must add more this code ";encrypt=true;trustServerCertificate=true;" at the end the line and press the Test Connection button(remember coppy code in the JDBC URL line) -> press Next button two times and finish
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/3878a424-9567-4150-a271-6b674da452ee)
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/2a0d9b20-7792-4aa4-9cb0-5c31a50042bf)
  + Step 3:  
    + In sources packages, open the file named MysqlConnect in GYMMANAGERMENT -> changes the url(Here, paste the one I asked you to copy above),user(your username in sql),pass(your password in sql)      
        ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/53cdf80f-1c1a-4c95-a17e-619727c31dde)
# Some images of the project:
  + Login of admind:
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/be28b82f-6fd0-409f-8566-523c61fec970)
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/61fd7dc4-4b51-4508-9c77-ac6f68772ec3)
  + Login of customer:
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/518e3d1c-64af-43d2-b76f-e54dba2edf50)
      ![image](https://github.com/Khoavo26042004/GYMMANAGERMENT/assets/154489298/21e23caa-284a-4530-bd86-daff1551024b)
# Author:
- [@Khoavo](https://github.com/Khoavo26042004)









