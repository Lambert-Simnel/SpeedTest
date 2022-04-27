import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class DogTest {

    private Dog dogTester;

    @BeforeEach
    private void settup() {
        dogTester = new Dog("goodboi", 10);
    }

    @Test

    public void testBork() {
        assertEquals("Bark! I am goodboi Bark!", dogTester.bork());
    }

}