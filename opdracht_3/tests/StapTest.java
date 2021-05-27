import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapTest {

    @Test
    public void Test_Constructor() {
        Stap step1 = new Stap(2.0, 2.0);
        assertEquals(4, step1.getCost());

        Stap step2 = new Stap(5.0, 7.0);
        assertEquals(35, step2.getCost());
    }

}