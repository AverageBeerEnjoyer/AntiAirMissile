package usa.airforce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AntiAirTest {
    double eps = 0.0000000001;
    @Test
    void test1(){
        double[] solution = AntiAir.solve(0,1,-1,0,Math.sqrt(2));
        assertEquals(-1, solution[0],eps);
        assertEquals(1, solution[1],eps);
    }
    @Test
    void test2(){
        double[] solution = AntiAir.solve(1,1,-1,0,1);
        assertEquals(0, solution[0],eps);
        assertEquals(1, solution[1],eps);
    }
}
