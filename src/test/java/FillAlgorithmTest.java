import org.junit.Test;

import java.util.ArrayList;

public class FillAlgorithmTest {

    private ArrayList<ArrayList<Float>> imageValues = Inputs.arrayToArrayList(Inputs.values15);
    private Image image4con = new Image(imageValues);
    private Image image8con = new Image(imageValues);
    private FillAlgorithm fillAlgorithm = new FillAlgorithm(new DefaultWeightFunction(0.2f, 2f));
    private HoleFiller holeFiller8con = new HoleFiller(image8con, fillAlgorithm, ePixelConnectivity.EIGHT);
    private HoleFiller holeFiller4con = new HoleFiller(image4con, fillAlgorithm, ePixelConnectivity.FOUR);

    @Test
    public void fillAlgorithmTest(){
        System.out.println("\nfill test 4con");
        fillTest4con(image4con);
        System.out.println("\nfill test 8con");
        fillTest8con(image8con);
    }

    private Pixel[][] fillTest4con(Image image){
        image.printImage();

        holeFiller4con.findHoleAndBoundaries();
        fillAlgorithm.fill(holeFiller4con.getHole(), holeFiller4con.getBoundaries());

        System.out.println();
        image.printImage();

        return image.getValues();
    }

    private Pixel[][] fillTest8con(Image image){
        image.printImage();

        holeFiller8con.findHoleAndBoundaries();
        fillAlgorithm.fill(holeFiller8con.getHole(), holeFiller8con.getBoundaries());

        System.out.println();
        image.printImage();

        return image.getValues();
    }
}