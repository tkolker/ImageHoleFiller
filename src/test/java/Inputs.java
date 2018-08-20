public class Inputs {

    static float[][] values1 = new float[][]{
            {0.1f, 0.1f, 0.1f},
            {0.1f, -1f, 0.1f},
            {0.1f, 0.1f, 0.1f},
    };

    public static Pixel[][] expected4con1 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f), new Pixel(0,2,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f), new Pixel(1,2,0.1f)},
            {new Pixel(2,0,0.1f), new Pixel(2,1,0.1f), new Pixel(2,2,0.1f)},
    };

    public static Pixel[][] expected8con1 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f), new Pixel(0,2,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f), new Pixel(1,2,0.1f)},
            {new Pixel(2,0,0.1f), new Pixel(2,1,0.1f), new Pixel(2,2,0.1f)},
    };

    static float[][] values2 = new float[][]{
            {-1f, 0.2f},
            {0.1f,0.1f},
    };

    public static Pixel[][] expected4con2 = new Pixel[][]{
            {new Pixel(0,0,0.15f), new Pixel(0,1,0.2f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    public static Pixel[][] expected8con2 = new Pixel[][]{
            {new Pixel(0,0,0.15f), new Pixel(0,1,0.2f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    static float[][] values3 = new float[][]{
            {-1f, 0.1f},
            {0.1f,0.1f},
    };

    public static Pixel[][] expected4con3 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    public static Pixel[][] expected8con3 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    static float[][] values4 = new float[][]{
            {-1f, -1f},
            {0.1f,0.1f},
    };

    public static Pixel[][] expected4con4 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    public static Pixel[][] expected8con4 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    static float[][] values5 = new float[][]{
            {-1f, -1f},
            {0.1f,-1f},
    };

    public static Pixel[][] expected4con5 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    public static Pixel[][] expected8con5 = new Pixel[][]{
            {new Pixel(0,0,0.1f), new Pixel(0,1,0.1f)},
            {new Pixel(1,0,0.1f), new Pixel(1,1,0.1f)},
    };

    static float[][] values6 = new float[][]{
            {0.5f, 0.4f},
            {0.1f,0.2f},
    };

    static float[][] values7 = new float[][]{
            {0.5f},
    };

    //throws exception as expected
    static float[][] values8 = new float[][]{
            {-1f},
    };

    //throws exception as expected
    static float[][] values9 = new float[3][];

    //throws exception as expected
    static float[][] values10 = new float[][]{
            {},
    };

    //throws exception as expected
    static float[][] values11 = new float[][]{
            {-1f, -1f},
            {-1f,-1f},
    };

    static float[][] values12 = new float[][]{
            {-1f, -1f, 0.2f, 0.1f},
    };

    static float[][] values13 = new float[][]{
            {0.1f, -1f, 0.2f, 0.1f},
    };

    static float[][] values14 = new float[][]{
            {0.4f, 0.4f, 0.2f, -1f},
    };

    static float[][] values15 = new float[][]{
            {-1f, -1f, -1f},
            {-1f, 0.1f, -1f},
            {-1f, -1f, -1f},
    };

    static float[][] values16 = new float[][]{
            {0.9f, -1f, -1f},
            {0.7f, -1f, 0.6f},
            {0.4f, -1f, -1f},
            {0.2f, 0.1f, -1f}
    };
}
