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

Aware Interfaces
Aware interfaces allow a Spring bean to access information about the Spring container or its own configuration. We use them when a bean needs details such as its name, the application context, or other container resources.

BeanNameAware
BeanNameAware gives a bean its name assigned by the Spring container. We use it when a bean needs to know its own bean name for logging, debugging, or custom processing.

ApplicationContextAware
ApplicationContextAware provides access to the Spring ApplicationContext. We use it when a bean needs to retrieve other beans, read application properties, or access Spring resources.

BeanPostProcessor
BeanPostProcessor allows custom logic to run before and after Spring initializes a bean. We use it to modify bean properties, create proxies, or add extra functionality like logging and security.

Before Initialization
The postProcessBeforeInitialization() method runs before initialization callbacks such as @PostConstruct. We use it to validate or modify bean properties before the bean becomes ready.

After Initialization
The postProcessAfterInitialization() method runs after the bean is fully initialized. We use it to wrap beans with proxies or add features like AOP, transactions, or logging.

Initialization Callbacks in Spring
Initialization callbacks execute automatically after dependency injection is complete. We use them to perform setup tasks such as loading configuration, opening connections, or initializing resources.

@PostConstruct
@PostConstruct marks a method that runs automatically after Spring injects all dependencies. We use it to initialize resources or perform startup tasks before the bean is used.

InitializingBean
InitializingBean requires implementing the afterPropertiesSet() method, which runs after dependency injection. We use it when initialization logic must be written using the Spring interface.

Custom initMethod
A custom initMethod is specified in the @Bean annotation and runs after bean creation. We use it when we want initialization logic without using Spring-specific interfaces or annotations.

Destruction Callbacks in Spring
Destruction callbacks execute before a bean is removed from the Spring container. We use them to release resources such as database connections, files, or network sockets.

@PreDestroy
@PreDestroy marks a method that runs just before the bean is destroyed. We use it to clean up resources and perform shutdown tasks.

DisposableBean
DisposableBean requires implementing the destroy() method, which Spring calls before bean destruction. We use it when cleanup logic needs to follow the Spring interface.

Custom destroyMethod
A custom destroyMethod is specified in the @Bean annotation and runs when the bean is destroyed. We use it to perform cleanup without implementing Spring-specific interfaces or using annotations.


Using @Value to Inject Properties

@Value is used to inject values from application.properties or application.yml into a variable. We use it when only a few configuration values are needed.

Default Values with @Value

We can provide a default value using @Value("${property:defaultValue}"). We use it to prevent errors when a property is missing.

Problem with Too Many @Value Annotations

Using many @Value annotations makes the code difficult to read and maintain. When there are many related properties, @ConfigurationProperties is a better choice.

Introduction to @ConfigurationProperties

@ConfigurationProperties maps a group of related properties to a single Java class. We use it to keep configuration clean, organized, and easy to manage.

Relaxed Binding in Spring Boot

Relaxed binding allows Spring Boot to map property names written in different formats (camelCase, kebab-case, snake_case, uppercase). We use it to make configuration flexible and easier to write.

@Value vs @ConfigurationProperties

Use @Value when injecting one or two properties. Use @ConfigurationProperties when working with multiple related properties because it is cleaner, type-safe, and easier to maintain.

Why We Need Runner Interfaces

Runner interfaces execute code automatically after the Spring Boot application starts. We use them for initialization tasks like loading data, testing, or printing startup information.

Why Not Manually Call Beans from main()

The main() method should only start the Spring application. We avoid calling beans manually because Spring manages bean creation, dependency injection, and lifecycle automatically.

CommandLineRunner

CommandLineRunner runs automatically after the application starts and receives command-line arguments as a String[]. We use it for startup tasks such as loading initial data or running setup code.

ApplicationRunner

ApplicationRunner also runs after application startup but provides command-line arguments through the ApplicationArguments object. We use it when we need structured access to command-line options and arguments.

Difference Between CommandLineRunner and ApplicationRunner

CommandLineRunner provides arguments as a simple String[], making it suitable for basic startup tasks. ApplicationRunner provides an ApplicationArguments object with methods to access option names and values, making it better for handling complex command-line arguments.
