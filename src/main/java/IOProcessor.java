import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class IOProcessor {

    public static Image parseStringToImage(String filename) throws IOException {
        ArrayList<ArrayList<Float>> imageValues = new ArrayList<>();
        ArrayList<Float> arrayRow;
        String row;
        String[] tokens;

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.read();
            while ((row = reader.readLine()) != null) {
                arrayRow = new ArrayList<>();
                //parsing based on input format
                tokens = row.substring(1, row.length() - 2).split(",");
                for (String value : tokens) {
                    arrayRow.add(Float.parseFloat(value));
                }
                imageValues.add(arrayRow);
            }
        }
        finally {
            reader.close();
        }

        return new Image(imageValues);
    }

    public static ePixelConnectivity parseConnectivityType(int connectivity) {
        return ePixelConnectivity.getConnectivityType(connectivity);
    }

    public static iWeightFunction createWeightFunction(String functionName, float eps, float exponent) {
        //Future: create different functions by function name

        return new DefaultWeightFunction(eps, exponent);
    }

    public static void generateOutput(Image image, String filepath) throws IOException {
        String filename = (new File(filepath)).getName();

        String imageValues = Arrays.deepToString(image.getValues());
        imageValues = imageValues.replaceAll("], \\[", "],\n[");

        String[] filenameToken = filename.split("\\.");
        String filenameWithoutSuffix = filenameToken[0];
        String suffix = filenameToken[1];

        String newFilename = filenameWithoutSuffix + "_holeFilled." + suffix;
        String newFilePath = filepath.replace(filename, newFilename);

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(newFilePath));
            writer.write(imageValues);
        }
        finally {
            writer.close();
        }

    }
}
