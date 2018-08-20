import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultWeightFunctionTest {

    @Test
    public void weightTest(){
        DefaultWeightFunction defaultWeightFunction = new DefaultWeightFunction(0.2f, 2);
        float res = defaultWeightFunction.weight(new Pixel(0,0, 0.7f), new Pixel(1,2, -1f));
        float expected = 0.19230769230769230769230769230769f;
        assertEquals(res, expected, 0);
    }

    @Test
    public void weightTest2(){
        DefaultWeightFunction defaultWeightFunction = new DefaultWeightFunction(0.2f, 2);
        float res = defaultWeightFunction.weight(new Pixel(1,1, 0.1f), new Pixel(0,0, -1f));
        float expected = 0.45454545454545454545454545454545f;
        assertEquals(res, expected, 0);
    }

    @Test
    public void weightTest3(){
        DefaultWeightFunction defaultWeightFunction = new DefaultWeightFunction(0.2f, 2);
        float res = defaultWeightFunction.weight(new Pixel(0,1, 0.1f), new Pixel(0,0, -1f));
        float expected = 0.83333333333333333333333333333333f;
        assertEquals(res, expected, 0);
    }

}