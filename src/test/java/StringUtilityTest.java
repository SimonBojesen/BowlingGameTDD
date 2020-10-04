import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing string utility methods")
public class StringUtilityTest extends StringUtility {
    private static String toBe;
    @BeforeEach
    void beforeEach() {
        toBe = "KekLmao";
    }

    @Test
    @DisplayName("Testing reversing string actually works")
    public void mustReverseStringTest() {
        //Arrange
        String expectedResult = "oamLkeK";
        //Act
        String actualString = reverseString(toBe);
        //Assert
        assertEquals(expectedResult, actualString);
    }

    @Test
    @DisplayName("Testing reverse string returns empty string if given null to avoid nullpointer")
    public void mustNotBeNullReverseTest() {
        //Arrange
        //Act
        String actualString = reverseString(null);
        //Assert
        assertNotNull(actualString);
    }

    @Test
    @DisplayName("Testing capitalize string returns empty string if given null to avoid nullpointer")
    public void mustNotBeNullCapitalizeTest() {
        //Arrange
        //Act
        String actualString = capitalizeString(null);
        //Assert
        assertNotNull(actualString);
    }

    @Test
    @DisplayName("Testing capitalizing string actually works")
    public void mustCapitalizeStringTest() {
        //Arrange
        String expectedResult = "KEKLMAO";
        //Act
        String actualString = capitalizeString(toBe);
        //Assert
        assertEquals(expectedResult, actualString);
    }

    @Test
    @DisplayName("Testing lowercase string returns empty string if given null to avoid nullpointer")
    public void mustNotBeNullLowercaseTest() {
        //Arrange
        //Act
        String actualString = lowercaseString(null);
        //Assert
        assertNotNull(actualString);
    }

    @Test
    @DisplayName("Testing lowercasing string actually works")
    public void mustLowercaseStringTest() {
        //Arrange
        String expectedResult = "keklmao";
        //Act
        String actualString = lowercaseString(toBe);
        //Assert
        assertEquals(expectedResult, actualString);
    }
}
