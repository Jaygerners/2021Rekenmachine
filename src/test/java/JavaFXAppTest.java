import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    JavaFXApp javaFXApp = new JavaFXApp();

    @Test
    void aDummyTest() {
        assertEquals(0, 0);
    }

    @Test
    void multiplyTest() {
        assertEquals(25, javaFXApp.computeMultiply(5, 5));

    }
}