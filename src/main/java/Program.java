import java.io.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args){

        String imageFilePath = args[0];
        ePixelConnectivity connectivityType = IOProcessor.parseStringToConnectivityType(Integer.parseInt(args[1]));
        float eps = Float.parseFloat(args[3]);
        float z = Float.parseFloat(args[4]);
        iWeightFunction weightFunction = IOProcessor.parseStringToWeightFunction(args[2], eps, z);

        Image image = IOProcessor.parseStringToImage(imageFilePath);
        FillAlgorithm fillAlgorithm = new FillAlgorithm(weightFunction);
        HoleFiller holeFiller = new HoleFiller(image, fillAlgorithm, connectivityType);

        //executes: findHoleAndBoundaries()
        //          fill()
        image = holeFiller.run();

        IOProcessor.generateOutput(image, imageFilePath);
    }
}
