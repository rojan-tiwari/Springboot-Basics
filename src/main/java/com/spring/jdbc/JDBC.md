# JDBC API
 JDBC API is an api that helps to connect our java program with database using drivers and execute SQL Queries.
 for ex- we are using mysql then,
 JDBC API --->MySQL JDBC Driver(com.mysql.jdbc.Driver) -->MySQL Database
 
 1.Load and register the driver
  class.forName("com.mysql.jdbc.Driver);
 2.Establish the connection
  Connection con = DriverManager.getConnection("URL","Username","Password");
 3.Create a statement
  Statement st = con.createStatement();
 4.Execute the query
  Result rs = st.executeQuery("select * from student")'
 5.Process result
  while(rs.next()){
   sout("rs.getInt(1) + "" + rs.getInt(2)); }
 6.Close
   St.close();
   Con.close();

# problems from JDBC API
1.we have to write a lot of codes.
2.problem with exception handling.

# Spring JDBC
 Solution of JDBC which provide the class "jdbcTemplate" which has all the important methods to perform operation with database.
DriverManagerDataSource() implements DataSource Interface;


 



