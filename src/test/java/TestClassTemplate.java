import org.junit.jupiter.api.*;

@DisplayName("JUnit5 Test class template")
public class TestClassTemplate {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test method");
        //Arrange

        //Act

        //Assert
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test method");
        //Arrange

        //Act

        //Assert
    }
}
