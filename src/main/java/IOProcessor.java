import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class IOProcessor {

    public static Image parseStringToImage(String filename) {
        ArrayList<ArrayList<Float>> imageValues = new ArrayList<>();
        ArrayList<Float> arrayRow;
        String row;
        String[] token;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            reader.read();
            while ((row = reader.readLine()) != null) {
                imageValues.add(arrayRow = new ArrayList<>());
                token = row.substring(1, row.length() - 2).split(",");
                for (String value : token) {
                    arrayRow.add(Float.parseFloat(value));
                }
            }

            reader.close();

        } catch(IOException e){
            e.printStackTrace();
        }

        return new Image(imageValues);
    }

    public static ePixelConnectivity parseStringToConnectivityType(int connectivity) {
        return ePixelConnectivity.getConnectivityType(connectivity);
    }

    public static iWeightFunction parseStringToWeightFunction(String functionName, float eps, float z) {
        if(functionName.equals(eWeightFunction.DEFAULT.toString()))
            return new DefaultWeightFunction(eps, z);

        else return new DefaultWeightFunction(eps, z);
    }

    public static void generateOutput(Image image, String filepath) {
        String filename = (new File(filepath)).getName();

        String imageValues = Arrays.deepToString(image.getValues());
        imageValues = imageValues.replaceAll("], \\[", "],\n[");

        String[] filenameToken = filename.split("\\.");
        String filenameWithoutSuffix = filenameToken[0];
        String suffix = filenameToken[1];

        String newFilename = filenameWithoutSuffix + "_holeFilled." + suffix;
        String newFilePath = filepath.replace(filename, newFilename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath));
            writer.write(imageValues);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
