import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    JavaFXApp javaFXApp = new JavaFXApp();
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    @Test
    void additionTest(){
        assertEquals(5,javaFXApp.computeAdd(2,3));
    }
}