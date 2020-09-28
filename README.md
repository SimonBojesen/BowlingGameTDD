# BowlingGameTDD

### Reflections:

##### Computer Mouse
What kinds of testing would be relevant to ensure it has a top quality.

* Durability
* Precision
* Haste (DPI)
* If the mouse has a cable we would test the cables durability

    If the mouse is wireless:
    *   Test wireless connection
    *   Test input lag
    
##### Catastrophic Failure
ROCKET LAUNCH ERRORS
In 1996, a European Ariane 5 rocket was set to deliver a payload of satellites into Earth orbit, but problems with the software caused the launch rocket to veer off its path a mere 37 seconds after launch. As it started disintegrating, it self-destructed (a security measure). The problem was the result of code reuse from the launch system’s predecessor, Ariane 4, which had very different flight conditions from Ariane 5. More than $370 million were lost due to this error.

https://www.pingdom.com/blog/10-historical-software-bugs-with-extreme-consequences/   

In this case it would have been smart to test the reused code from Ariane 4 to simulate how the new and improved Ariane 5 would fly with the code.

##### Investigation of JUnit 5 Tools

 * @Tag: This annotation is used to as an identifier for the program to know what test to run in given a test plan. This is useful because you can use this to run only some tests in different test plans. Also you might wanna 
 * @Disabled: This tag is used to disable a test so it will not be executed when running test file. This is useful when you have disabled a part of your program.
 * @RepeatedTest: This is tag used to signal that the annotated method is a test template method that should be repeated a specified number of times with a configurable display name. This is useful to make sure that the test does not fail due to environmental issues.
 * @BeforeEach, @AfterEach: These annotations are used to specify a method that is run before or after each test case. This is useful to setup tests and remove redundancies from the code.
 * @BeforeAll, @AfterAll: These annotations is used to signal that the annotated method should be executed before or after all tests in the current test class. This is useful for setting up test data like instanciating classes.
 * @DisplayName: This annotation is used to declare a custom display name for the annotated test class or test method. Display names are typically used for test reporting in IDEs and build tools and may contain spaces, special characters, and even emoji.
 * @Nested: The @Nested annotation allows you to have an inner class that's essentially a test class, allowing you to group several test classes under the same parent (with the same initialization). This is useful when you need to organize bigger test cases.
 * assumeFalse, assumeTrue: Assumptions is a collection of utility methods that support conditional test execution based on assumptions. This is useful when your test case manipulates some data, that you for example assumes will become "3". If you run assumeTrue on it and the data is something other then 3 the test would be aborted. It's the other way around with assumeFalse.
 
 ##### Mocking framework
 
 Investigate mocking frameworks for your preferred language. Choose at least
 two frameworks, and answer the questions. (One could be Mockito, which
 we saw in class.)
 
 I chose Mockito and EasyMock
 
 ###### Similarities
 * Annotationbased
 
 ###### Differences 
 * in EasyMock you will have to write EasyMock.replay(mock) on every test method, or you will receive an exception.
 
 I would prefer to use Mockito because it requires less setup to work.