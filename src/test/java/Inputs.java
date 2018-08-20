import java.util.ArrayList;

public class Inputs {

    static float[][] values1 = new float[][]{
            {0.1f, 0.1f, 0.1f},
            {0.1f, -1f, 0.1f},
            {0.1f, 0.1f, 0.1f},
    };

    static float[][] values2 = new float[][]{
            {-1f, 0.2f},
            {0.1f,0.1f},
    };

    static float[][] values3 = new float[][]{
            {-1f, 0.1f},
            {0.1f,0.1f},
    };

    static float[][] values4 = new float[][]{
            {-1f, -1f},
            {0.1f,0.1f},
    };

    static float[][] values5 = new float[][]{
            {-1f, -1f},
            {0.1f,-1f},
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

    static ArrayList<ArrayList<Float>> arrayToArrayList(float[][] valuesArr) {
        ArrayList<ArrayList<Float>> valuesArrayList = new ArrayList<>();
        ArrayList<Float> rowArrayList;
        for(float[] rowArr : valuesArr){
            rowArrayList = new ArrayList<>();
            for(float valueArr : rowArr){
                rowArrayList.add(valueArr);
            }
            valuesArrayList.add(rowArrayList);
        }

        return valuesArrayList;
    }
}
