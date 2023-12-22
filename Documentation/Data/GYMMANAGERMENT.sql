CREATE DATABASE GYMMANAGERMENT
USE GYMMANAGERMENT

SELECT * FROM users
SELECT * FROM class
SELECT * FROM staff
SELECT * FROM customer
SELECT * FROM payment
SELECT * FROM class_time
SELECT * FROM room
SELECT * FROM membership
SELECT * FROM staff_class
select * from sign_membership
SELECT * FROM signup

--******************************************************************--
		IF OBJECT_ID('sign_membership', 'U') IS NOT NULL
			DROP TABLE sign_membership;
		IF OBJECT_ID('staff_class', 'U') IS NOT NULL
			DROP TABLE staff_class;
		IF OBJECT_ID('signup', 'U') IS NOT NULL
			DROP TABLE signup;
		IF OBJECT_ID('payment', 'U') IS NOT NULL
			DROP TABLE payment;
		IF OBJECT_ID('customer', 'U') IS NOT NULL
			DROP TABLE customer;
		IF OBJECT_ID('membership', 'U') IS NOT NULL
			DROP TABLE membership;		
		IF OBJECT_ID('class_time', 'U') IS NOT NULL
			DROP TABLE class_time;
		IF OBJECT_ID('class', 'U') IS NOT NULL
			DROP TABLE class;
		IF OBJECT_ID('staff', 'U') IS NOT NULL
			DROP TABLE staff;
		IF OBJECT_ID('room', 'U') IS NOT NULL
			DROP TABLE room;
		IF OBJECT_ID('users', 'U') IS NOT NULL
			DROP TABLE users;
--******************************************************************--

			-- Table structure for table `users`

		CREATE TABLE users (
		  UserID int NOT NULL PRIMARY KEY IDENTITY(1,1),
		  Username varchar(255) ,
		  Password varchar(255) NOT NULL,
		  Roles varchar(255),
		  emp_ID int 
		);

			-- Dumping data for table `users`

		INSERT INTO users (Username, Password, Roles) VALUES
		('Khoa', 'Khoa@', 'Admin'),
		('Long', 'Long@', 'Customer'),
		('Luong', 'Luong@', 'Customer');
		


--******************************************************************--
			-- Table structure for table `room`

		CREATE TABLE room (
		  RID int NOT NULL PRIMARY KEY,
		  RName varchar(255),
		  Capacity int		  
		);


		-- Dumping data for table `room`

		INSERT INTO room (RID,RName,Capacity) VALUES
		(1,'Class A' ,100),
		(2,'Class B' ,40),
		(3,'Class C' ,200),
		(4, 'Class D',150);

--******************************************************************--

			-- Table structure for table `staff`

				--Use to take the info staff

		CREATE TABLE staff (
		  SID int NOT NULL PRIMARY KEY IDENTITY(1,1),	
		  SName varchar(255) NOT NULL,
		  SAge int ,
		  Salary int ,
		  Experience varchar(255),
		  Designation varchar(255)	  
		);

				-- Dumping data for table `staff`

		INSERT INTO staff (SName, SAge, Salary, Experience, Designation) VALUES
		('Rajnesh', 32, 10000,  5, 'Trainer'),
		('Yash', 27, 10000,  3, 'Trainer'),
		('Sarita', 27, 10000,3, 'Trainer');



--******************************************************************--

			-- Table structure for table `class`


		CREATE TABLE class (
		  CLID int NOT NULL PRIMARY KEY IDENTITY(1,1),
		  Title varchar(255),
		  Cost int
		);


				-- Dumping data for table `class` 

		INSERT INTO class (Title,Cost) VALUES
		('Special Yoga class',100),
		(  'Zumba class',200),
		( 'Diet Counselling',100);

--******************************************************************--

		CREATE TABLE class_time(
			CLTID int PRIMARY KEY IDENTITY(1,1),
			CLID INT NOT NULL,
			Start_time varchar(255),
			End_time varchar(255),
			CONSTRAINT FK_Signup_Class FOREIGN KEY(CLID) REFERENCES class(CLID),
		);
		INSERT INTO class_time (CLID,Start_time,End_time) VALUES
		(1,'5:00:00','7:00:00'),
		(1,'7:00:00','9:00:00'),
		(1,'13:00:00','15:00:00'),
		(2,'7:00:00','9:00:00'),
		(2,'9:00:00','11:00:00'),
		(2,'13:00:00','15:00:00'),
		(2,'15:00:00','17:00:00'),
		(3,'13:00:00','15:00:00');
DELETE FROM class_time where CLTID = 
--******************************************************************--

			-- Table structure for table `membership`


		CREATE TABLE membership (
		  MEMID int NOT NULL PRIMARY KEY IDENTITY(1,1),
		  Fees int ,
		  MName varchar(50),
		  Facility varchar(255),
		);

		INSERT INTO membership (Fees, MName, Facility) VALUES
		(170, 'Platinum ', 'Unlimited workout,Shower,Locker,dressing room,steam room'),
		(160, 'Diamond ', 'Unlimited workout,Shower,Locker'),
		(150, 'Golden', '6 hrs workout,Shower,Locker'),
		(100, 'Silver', '4 hrs workout per day,Locker'),
		(80, 'Bronze', '2 hrs workout per day,Locker');

--******************************************************************--

 

--******************************************************************--

			-- Table structure for table `customer`


		CREATE TABLE customer (
		  CID int NOT NULL PRIMARY KEY IDENTITY(1,1),
		  CName varchar(255) NOT NULL,
		  CAge int ,
		  Phone varchar(255) NOT NULL,
		  Email varchar(255),
		  Address varchar(255),
		  Gender varchar(255),
		  Height int ,
		  Weight int ,
		  DateOfMem date,
		);

					--Dumping data for table `customer`

		INSERT INTO customer(CName, CAge, Phone, Email, Address, Gender, Height, Weight, DateOfMem) VALUES
		( 'Luong', 26, '9898979745', 'Luong25@hotmail.com', 'B/26,khira nagar,santacruz(w)', 'M', 165, 70, '2017-09-01'),
		( 'Long', 28, '9197512365', 'Long28@rediffmail.com', 'A/16,Aparna apartment,kurla(w)', 'M', 162, 71, '2017-09-01');

				

--******************************************************************--

			-- Table structure for table `payment`

		CREATE TABLE payment (
		  PID int NOT NULL PRIMARY KEY IDENTITY(1,1),
		  Status varchar(255) ,
		  Amount int DEFAULT NULL,
		  LastDateOfPayment date DEFAULT NULL ,
		  ModeOfPayment varchar(255) ,
		  CID int NOT NULL,
		  CONSTRAINT FK_Payment_Customer FOREIGN KEY(CID) REFERENCES customer(CID)
		);


				-- Dumping data for table `payment`

		-- Đoạn dữ liệu mới cho bảng payment
		INSERT INTO payment (Status, Amount, LastDateOfPayment, ModeOfPayment, CID)
		VALUES
		('Pending', 8000, '2017-10-29', 'Cash', 1),
		('Pending', 8000, '2017-09-10', 'Debit card', 2);


--******************************************************************--

			-- Table structure for table `signup`


				--Use to sign 

		CREATE TABLE signup (
		  SignupID int PRIMARY KEY IDENTITY(1,1),
		  CID int NOT NULL,
		  CLID int NOT NULL,
		  Cost int,
		  SignUpDate date ,	
		  constraint FK_signup_customer foreign key(CID) references customer(CID),
		  constraint FK_signup_class foreign key(CLID) references class(CLID)
		);

				-- Dumping data for table `signup`

		INSERT INTO signup (CID, CLID,Cost, SignUpDate) VALUES
		(1,1,1,100,'2017-09-13'),
		(1,2,2,200,'2017-09-13');		

--******************************************************************--
		CREATE TABLE staff_class(
			STCID int PRIMARY KEY IDENTITY(1,1),
			SID INT NOT NULL,
			CLTID INT NOT NULL,
			CONSTRAINT FK_staff_class_Staff FOREIGN KEY(SID) REFERENCES staff(SID),
			CONSTRAINT FK_staff_class_class_time FOREIGN KEY(CLTID) REFERENCES class_time(CLTID)

		);

		INSERT INTO staff_class (SID, CLTID) VALUES
		(1,1),
		(1,2);		
--******************************************************************--

		CREATE TABLE sign_membership(
			SMID int NOT NULL PRIMARY KEY IDENTITY(1,1),
			CID int ,
			MEMID int,
			Dateofsign date,
			constraint FK_sign_membership_customer foreign key(CID) references customer(CID),
			constraint FK_sign_membership_membership foreign key(MEMID) references membership(MEMID)
			
		);

					--Dumping data for table `staff_class`

		INSERT INTO sign_membership(CID, MEMID,Dateofsign) VALUES
		(1, 2,'2017-09-23'),
		(1, 1,'2017-09-23');
		
--******************************************************************--
		-----------------------------------------------

		IF OBJECT_ID('updatepaymentoninsertcustomer', 'TR') IS NOT NULL
			DROP TRIGGER updatepaymentoninsertcustomer;
		GO

		CREATE TRIGGER updatepaymentoninsertcustomer
		ON customer
		AFTER INSERT
		AS
		BEGIN
			INSERT INTO payment (Status, Amount, CID)
			SELECT 'Pending', (SELECT Fees FROM membership WHERE MEMID = inserted.MEMID) * inserted.CID
			FROM inserted;
		END;
		GO

		-------------------------------------------------

		IF OBJECT_ID('updatepaymentonmembershipupgrade', 'TR') IS NOT NULL
			DROP TRIGGER updatepaymentonmembershipupgrade;
		GO

		CREATE TRIGGER updatepaymentonmembershipupgrade
		ON customer
		AFTER UPDATE
		AS
		BEGIN
			UPDATE payment 
			SET Amount = Amount + (SELECT Fees FROM membership WHERE MEMID = inserted.MEMID) - (SELECT Fees FROM membership WHERE MEMID = deleted.MEMID) -- hiểu nôm na là mình thêm thì mình phải update
			FROM payment
			INNER JOIN inserted ON inserted.CID = payment.CID
			INNER JOIN deleted ON inserted.CID = deleted.CID;
		END;
		GO

--******************************************************************--
			-- Triggers `payment`

		IF OBJECT_ID('updatestatus', 'TR') IS NOT NULL
			DROP TRIGGER updatestatus;
		GO

		CREATE TRIGGER updatestatus
		ON payment
		AFTER UPDATE
		AS
		BEGIN
			UPDATE payment
			SET Status = 'Clear'
			WHERE Amount = 0;
		END;
		GO