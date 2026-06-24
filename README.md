Spring is a popular Java framework used for building scalable, secure, and maintainable enterprise applications. 
It provides features like Dependency Injection (DI), Inversion of Control (IoC), and easy integration with databases and web services. 
Its advantages include reduced boilerplate code, better modularity, and faster application development. 
Common use cases include web applications, REST APIs, microservices, cloud-native applications, and enterprise software development.

AnnotationConfigApplicationContext
AnnotationConfigApplicationContext is a Spring container used to create and manage beans using Java annotations instead of XML. We use it when configuring a Spring application with @Configuration, @Bean, and component scanning.

getBean()
getBean() is used to retrieve a bean object from the Spring IoC container. We use it when we need to access a Spring-managed object manually from the container.

@Component
@Component marks a class as a Spring bean so that Spring can automatically detect and manage it. We use it for service, repository, utility, or any class that should be managed by Spring.

@Bean
@Bean marks a method whose return object should be registered as a Spring bean. We use it when creating beans for third-party classes or when custom bean creation logic is needed.

@Configuration
@Configuration indicates that a class contains Spring bean definitions. We use it to define application configuration using Java code instead of XML.

@ComponentScan
@ComponentScan tells Spring where to search for classes annotated with @Component, @Service, @Repository, and @Controller. We use it to enable automatic bean discovery.

Dependency Injection (DI)
Dependency Injection is a design pattern where Spring provides required objects to a class instead of the class creating them itself. We use it to achieve loose coupling, better testability, and easier maintenance.

Types of Dependency Injection
Constructor Injection: Dependencies are provided through the constructor. Preferred for mandatory dependencies.
Setter Injection: Dependencies are provided using setter methods. Used for optional dependencies.
Field Injection: Dependencies are injected directly into fields using @Autowired. Simple but less recommended for testing.

@Autowired
@Autowired automatically injects a matching bean into a class. We use it to avoid manually creating and wiring dependent objects.

@Primary
@Primary specifies the default bean when multiple beans of the same type exist. We use it to tell Spring which bean should be injected by default.

@Qualifier
@Qualifier is used with @Autowired to specify exactly which bean should be injected when multiple beans of the same type are available.

Circular Dependency
A circular dependency occurs when Bean A depends on Bean B and Bean B depends on Bean A. It creates a dependency loop and can prevent application startup, especially with constructor injection.

Bean Scope
Scope defines how many instances of a bean Spring should create and manage. We use scopes to control bean lifecycle and memory usage.

Singleton Scope
Singleton is the default Spring scope where only one bean instance exists for the entire container. We use it for stateless services and shared resources to save memory.

Prototype Scope
Prototype scope creates a new bean instance every time it is requested. We use it when each user or task requires a separate object with its own state.

Lazy Initialization
In lazy initialization, a bean is created only when it is first needed. We use it to reduce startup time and save resources for rarely used beans.

Eager Initialization
In eager initialization, beans are created during application startup. We use it when beans are required immediately and we want startup-time validation of dependencies.
