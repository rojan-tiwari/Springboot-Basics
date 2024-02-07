# SpringBasics  <br>
Spring Intro: Open source java framework.it is used to create both standalone and enterprise application. it was developed by "Rod Johnson".  <br>
A standalone application, also known as a desktop application is a software program designed in such a way that to run this software program, users don't need an internet connection or any server access    <br>

# Advantages.  <br>
Modular and lightweight.  <br>
Flexible Configuration.   <br>
Dependency Injection     <br>
Aspect-Oriented Programming     <br>
Simplified Database Access.     <br>
Integration Capabilities.    <br>
Open Source.    <br>

# SpringContainer or IOC

### Responsibilities of spring Container:
Manage Bean object.
Manage Bean Life Cycle.
Dependency Injection.
AOP.
I18N.

A *java bean class* is just a standard.It is a regular java class but it follows some convention:
a.All properties are private (use getter and setter)
b.A public no-argument constructor.
c.It should have getters and setters to get and set the values in properties.
The object created of this javabean class is known as Bean Object.
Beans are also special type of POJOs but there are some restriction on POJO to be bean.
All JavaBeans are POJOs but not all POJOs are JavaBeans.

*POJO(Plain Old Java Object) Class*: A simple Java Class with fields and getters/setters , used for data representation without framework dependencies.


### Types of Spring Container:
a.Bean Factory(old)
b.Application Context(new)(interface to start spring container)


# Configuration in spring can be done in three ways:
 **Spring with XML Config**
  In XML-based Spring Configuration, we use <bean> tags to define beans.
  We provide an "id" attribute to specify the bean name and we specify the "class" name using the class attribute.

 **Spring with java Config** 
  In Java-based Configuration, we use methods annotated with @Bean to define beans.
  The "method name" becomes the default bean name and the "return type" of the method determines the class of the object that will be created as the bean.
  The method annotated with @Bean will:
   a.Create a new Student object
   b.Configure the Student object,setting its properties using setxxx methods.
   c.The default bean name for this method will be "stdId1" which is the same as the method name
   d.Return the configured Student Object.

   -@Configuration indicates that the class is spring configuration class.
   -It means that annotated java class contains bean definitions and configuration settings for the spring application context.
   -@Configuration allows us to define beans and their dependencies in a java-based way instead of using XML configuration files.
   -Its show in fig name :XMLandJavaConfig.png

  **Spring with Annotation Based Configuration**

####    It can be done in both ways either in XML config file or Java Config File.

  Using XML config we have to give the  <context:component-scan base-package="com.spring.pojoClass"/>
  Using Java Config we have to give @ComponentScan annotation in the config file.
   @Component : it is used to create a object of the class.
   In a Spring XML config file , <context:component-scan> is used to instruct the Spring Framework to perform component scanning.
   It scans specified packages in the application's classpath for classes annotated with annotations like @Component,@Service,@Repository and @Controller.
   These discovered classes are then registered as Spring beans, enabling automatic dependency injection and other Spring features.
   @Value : Used to inject values into Spring bean fields or methods. 


 **Spring Bean Life Cycle**
1.Loading bean definitions :Spring loads bean definitions from various sources such as XML COnfig file, JAVA config file or component scanning.
                            These bean definitions contain information about the bean class,dependencies and other configuration details.
2.Bean Instantiation : After bean definition are loaded, the Spring Container creates instances of beans based on these definitions.
                       This involves invoking the bean class constructor,either default or parameterized to create the an actual instance of bean.
                       This newly created bean instance is now ready for configuration and initialization.
3.Bean Initialization: Once the bean is instantiated Spring proceeds to configure and initialize it.
                       Property values are set using setter,constructor arguments,or field injection, populating the bean's state.
4.Use Bean Object
5.Bean Destruction
 _Figure : BeanLifeCycle_


**Dependency Injection**
DI is a design pattern used in the spring framework to achieve Inversion Of Control(IOC)
1.It is a Design Pattern.(Design patterns are like pre-tested and proven blueprints for solving common software problem.Ex- Singleton Pattern,DAO Pattern, MVC design pattern.)
2.It is used to inject the dependency of one object to another.
3.It is used to achieve loose coupling.
4.It can be done using either XML config file or Java config file
4.We can do DI in 2 ways:
a.Setter Method DI
-Dependencies are injected into a class through setter methods.
-Setter Method DI is more readable
-Setter method DI is more Flexible

b.Constructor DI
-Dependencies are injected into a class through constructor.
-Setter Method DI is less readable
-Setter method DI is less Flexible

Example:
`class Engine{
private string engineNo;
}

class Car{
 private String name;
 private Engine engine;       //Dependency Injection
}`

what happens if we dont use DI?
we have to hardcode.They will be tightly coupled and create problems in future while updating values.
Loosely Coupled and Tightly Coupled in figure.

#### Autowiring
Autowiring is the process of injecting the dependencies automatically using @Autowired annotation.
It simplifies the code by letting Spring handle object connections for us.
@Qualifier annotation in spring helps pick the right bean among multiple beans of the same type.it helps spring to know which bean you want injected, resolving ambiguity.


-------------------------------------------------------------------------------------------------------------------------------

# JDBC API

JDBC API is an api that helps to connect our java program with database using drivers and execute SQL Queries. for ex- we are using mysql then, JDBC API --->MySQL JDBC Driver(com.mysql.jdbc.Driver) -->MySQL Database

1.Load and register the driver class.forName("com.mysql.jdbc.Driver); 2.Establish the connection Connection con = DriverManager.getConnection("URL","Username","Password"); 3.Create a statement Statement st = con.createStatement(); 4.Execute the query Result rs = st.executeQuery("select * from student")' 5.Process result while(rs.next()){ sout("rs.getInt(1) + "" + rs.getInt(2)); } 6.Close St.close(); Con.close();

problems from JDBC API

1.we have to write a lot of codes. 2.problem with exception handling.

# Spring JDBC

Solution of JDBC which provide the class "jdbcTemplate" which has all the important methods to perform operation with database. DriverManagerDataSource() implements DataSource Interface;


** HIBERNATE **
Hibernate is a Java framework that simplifies the development of Java application to interact with the database. It is an open source, lightweight, ORM (Object Relational Mapping) tool.
Hibernate implements the specifications of JPA (Java Persistence API) for data persistence.
By mapping Java objects to database tables, it streamlines data persistence and retrieval without the need for complex SQL queries.

** ORM **
An ORM tool simplifies the data creation, data manipulation and data access and It is a programming technique that maps the object to the data stored in the database.
ORM Stands for Object-Relational Mapping that maps the data in the database to the Java Class which is called an Entity. Not only that, but ORM also preserves the relationship between the tables at the Entity level.

There are many ORM frameworks in  the market and the famous ones for Java are
a.Hibernate
b.EclipseLInk
c.iBATIS



### Why hibernate if we already has JDBC?
In springJDBC we had to write the sql query manaully but in hibernate it simplifies it with different methods and annotations.
JDBC code needs to be written in try..catch block as it throws checked exception but in hibernate it handles the exception by marking them as unchecked exception.


-------------------------------------------------------------------------------------------------------------------------------


#Session Factory
SessionFactory in Hibernate is responsible for the creation of Session objects. The Hibernate Session provides methods such as save, delete and update, all of which are used to perform CRUD-based operations on the database to which the SessionFactory connects.


Hibernate can de done either by using XML file or annotation besides configuration. we use annotations because its easier to code.


commonly used annotations in hibernate

@Entity- use to mark any class as Entity
@Table - use to change the table details
@Id - use to mark column as id(primary-key)
@GeneratedValue - hibernate will automatically generate values for that using an internal sequence.Therefore we dont have to set it manually.
@Column- can be used to specify column mappings. for ex- to change the column name in the associated table in database.
@Transient - this tells hibernate not to save this field.
@Temporal - Temporal over a date field tells hibernate the format in which the date needs to be saved
@Lob- tells hibernate that this is a largeObject, not a simple object.



# why we needed JPA?
JPA is a specification or guidelines. It gives common functionality and prototype to ORM tools. All ORM tools (such as Hibernate) follow the common standards, by executing the same specification. Subsequently, if we need to switch our application from one ORM tool to another then we can easily do it.


#why we needed Spring data JPA?
Let's say you are using spring + hibernate for your application. Now you need to have dao interface and implementation where you will be writing crud operation using SessionFactory of hibernate. Let say you are writing dao class for Employee class, tomorrow in your application you might need to write similiar crud operation for any other entity. So there is lot of boilerplate code we can see here.
Now Spring data jpa allow us to define dao interfaces by extending its repositories(crudrepository, jparepository) so it provide you dao implementation at runtime. You don't need to write dao implementation anymore.Thats how spring data jpa makes your life easy.

# what is relation between hibernate ,JPA and Spring Data JPA?

JPA(Java Persistence API) is a Java specification that gives some functionality and standard to ORM tools. It is used to examine, control, and persist data between Java objects and relational databases. It is observed as a standard technique for Object Relational Mapping.

There are various provider which implement jpa. Hibernate is one of them.Hibernate is a framework that implements JPA guidelines.


Spring Data is a convenience library on top of JPA.Spring Data JPA cannot work without a JPA providers(Hibernate, EclipseLink, and Apache OpenJPA).
Spring Data JPA eliminates the need for generic DAO (Data Access Object) implementations through the use of repository interfaces and automatic query generation.Spring Data JPA introduces the concept of repository interfaces.
These interfaces declare methods for common CRUD operations and queries without providing the implementation. Developers create interfaces by extending Spring Data JPA's base repository interfaces like JpaRepository.
These base interfaces already define common methods for saving, updating, deleting, and querying entities.


# DAO design pattern
Data Access Object patterns, often known as DAO patterns, are used to divide high level business services from low level data accessing APIs or actions. The members of the Data Access Object Pattern are listed below.

Data Access Object Interface: The Data Access Object Interface specifies the common operations to be carried out on a model object (s).

Concrete Data Access Object class: This class implements the aforementioned interface. This class is in charge of obtaining data from a data source, which could be a database, XML, or another type of storage system.

Model or Value Object: This object is a straightforward POJO with get/set methods for storing data obtained using the DAO class.


#dao model or value object this object is a straightforward pojo with get/set methods for storing data obtained using the dao class.


-------------------------------------------------------------------------------------------------------------------------------

** Servlet **
Servlet is a server side technology that handles the request, process the request and gives the dynamic response.
Servlet can be create using
a.Implementing Servlet Interface (it defines servlet life-cycle methods)
b.Extending GenericServlet Class (When we want to create protocol independent servlet.it doesn't have request and response methods)
c.Extending HTTPServlet Class (it is used when we want http methods and request-response object .It is mostly used)

Servlet (Interface)-->GenericServlet(class)-->HTTPServlet(Class)

### we have to create a "DeploymentDescriptor" file.

** lifecycle of servlet **

a.Loading : When the server starts servlet class is loaded and servlet object is  created.

b.Initialization init() : Servlet object will be initialized when we invoke init() method.

c.RequestHalding service() : In this phase ,client request are handled by using different threads for different requests and service() method is invoked.

d.Destroy : When the server stops then all the servlet are deleted. we do it by invoking destroy() method.


** How Servlets Works **

First we make any class servlet by using mentioned one of the three steps. Then in web.xml file we provide mapping for the direction of all the requests to the appropriate servlets and it executes.we write the html,jsp all the files in WEB-INF.

it can be done using Annotations @WebServlet also instead of web.xml file. but we need apache tomcat server version more than 7.


** HTTPServletRequest And HTTPServletResposne  **

Both are interfaces and have their own methods. request is used to get the values and response is used to dynamically display values.


** Send Redirect and RequestDispatcher **
sendRedirect() method is used to redirect the response to another resource(to servlet or JSP or HTML to another application).It is method of HttpServletResponse.it will change the URL.

The RequestDispatcher interface is used to dispatch the request to another resource(servlet or jsp or html within the "same application").it willnot change url.

#Http Session Management
Session is basically used when we want to maintain users identity or if we have to use the same values in different pages then we use session concepts.
It is present in HttpServletRequest interface.
In Servlet,
HttpSession hs = request.getSession();
//Getting a session and if not available it automatically creates it.
hs.setAttribute("key" , value);
//we set values in session in key value pair
Object ob = hs.getAttribute("key");
//we can get the same value using key in different pages instead of getting from response instance of HttpServletResponse for every pages which will be boiler plate code.
hs.removeAttributte("key");
//to remove single attribute
hs.invalidate();
//to remove whole session

-------------------------------------------------------------------------------------------------------------------------------


** JSP(Java Server Pages) **
It is also a server side technology which is used to create Dynamic Web Pages.
In Servlet we had to create a dynamic web pages by using out.print() for every HTML file which was really difficult in huge projects so inorder to reduce this complexity JSP was introduced where we code front-end part in .JSP file which is underline by HTML and we make it dynamic by embedding java inside it through different tags like declarative tags, Scriptlet Tag , Expression Tag etc



** JSP TAGS  **

-Scripting Tags <% - %>
it is used to embed java code within the jsp page.

-Directive Tags  <%@  - %>
Are used to provide instructions or directives to the JSP container on bhow to handle the JSP page during compilation and execution.


-Action Tags <jsp: - />
Are used to perform specific actions or operation within the JSP page.Action tag provide a way to interact with java objects, control flow, and perform actions like forwarding, including other resources and manipulating session attributes.


-------------------------------------------------------------------------------------------------------------------------------

 **Jackson**
 Jackson is one of the most used libraries of spring boot which translates JSON data to a Java POJO by itself and vice-versa.
 Now to exchange data between the front end and the backend, we have to use a common format which is – JavaScript Object Notation (JSON). Now, each time the data is received by the back-end, since we’re using java, java doesn’t understand what’s JSON. It stores data in the form of plain-old-java-objects (POJOs). So, this JSON Data needs to be converted into the form which java understands.  So, if we were to convert data received or send in every request, there would be a lot of extra work and more code to do for programmers. To solve this problem, we’re provided with a library called – Jackson.Now to exchange data between the front end and the backend, we have to use a common format which is – JavaScript Object Notation (JSON). Now, each time the data is received by the back-end, since we’re using java, java doesn’t understand what’s JSON. It stores data in the form of plain-old-java-objects (POJOs). So, this JSON Data needs to be converted into the form which java understands.  So, if we were to convert data received or send in every request, there would be a lot of extra work and more code to do for programmers. To solve this problem, we’re provided with a library called – Jackson.
 Jackson further uses : ObjectMapper class behind the scene to convert JSON to POJO and POJO to JSON
 https://www.geeksforgeeks.org/how-jackson-data-binding-works-in-spring-boot/
jackson annotations : https://www.geeksforgeeks.org/jackson-annotations-for-java-application/



 **Actuators**
 https://www.baeldung.com/spring-boot-actuators#understanding-actuator






















 

 
  








