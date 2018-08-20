import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        if(args.length != 5){
            System.out.println("Wrong number of arguments");
            System.out.println("Expected arguments: <image_file_path> <connectivity_type> <weight_function> <epsilon> <exponent>");
            return;
        }

        String imageFilePath = args[0];
        ePixelConnectivity connectivityType = IOProcessor.parseConnectivityType(Integer.parseInt(args[1]));
        float eps = Float.parseFloat(args[3]);
        float exponent = Float.parseFloat(args[4]);
        iWeightFunction weightFunction = IOProcessor.createWeightFunction(args[2], eps, exponent);

        Image image = IOProcessor.parseStringToImage(imageFilePath);
        FillAlgorithm fillAlgorithm = new FillAlgorithm(weightFunction);
        HoleFiller holeFiller = new HoleFiller(image, fillAlgorithm, connectivityType);

        image = holeFiller.run();

        IOProcessor.generateOutput(image, imageFilePath);
    }
}
