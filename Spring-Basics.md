# SpringBasics  <br>
Spring Intro: Open source java framework.it is used to create both standalone and enterprise application. it was developed by "Rod Johnson".  <br>
A standalone application, also known as a desktop application is a software program designed in such a way that to run this software program, users don't need an internet connection or any server access    <br>

# Advantages.  <br>
Modular and lightweight.  <br>
Flexible Configuration.   <br>
Dependency Injection     <br>
Aspect-Orieneted Programming     <br>
Simplified Database Access.    <br>
Integration Capabilities.    <br>
Open Source.    <br>

# SpringContainer or IOC
A *java bean class* is just a standard.It is a regular java class but it follows some convention:
a.All properties are private (use getter and setter)
b.A public no-argument constructor.
c.Implements Serializable.
The object created of this javabean class is known as Bean Object.

*POJO(Plain Old Java Object) Class*: A simple Java Class with fields and getters/setters , used for data representation without framework dependencies.

### Responsibilities of spring Container:
Manage Bean object.
Manage Bean Life Cycle.
Dependency Injection.
AOP.
I18N.

### Types of Spr1ing Container:
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


 

 
  








