import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HoleFillerTest {

    private FillAlgorithm fillAlgorithm = new FillAlgorithm(new DefaultWeightFunction(0.2f, 2));
    private Image image = new Image(Inputs.arrayToArrayList(Inputs.values16));
    private HoleFiller holeFiller4con = new HoleFiller(image, fillAlgorithm, ePixelConnectivity.FOUR);
    private HoleFiller holeFiller8con = new HoleFiller(image, fillAlgorithm, ePixelConnectivity.EIGHT);

    @Test
    public void findHoleAndBoundaries4conTest(){
        ArrayList<Pixel> expectedHole = createExpectedHole();
        ArrayList<Pixel> expectedBoundaries = createExpectedBoundaries4con();
        ArrayList<Pixel> hole;
        ArrayList<Pixel> boundaries;

        holeFiller4con.findHoleAndBoundaries();

        hole = holeFiller4con.getHole();
        boundaries = holeFiller4con.getBoundaries();

        assertArrayEquals(boundaries.toArray(), expectedBoundaries.toArray());
        assertArrayEquals(hole.toArray(), expectedHole.toArray());
    }

    @Test
    public void findHoleAndBoundaries8conTest(){
        ArrayList<Pixel> expectedHole = createExpectedHole();
        ArrayList<Pixel> expectedBoundaries = createExpectedBoundaries8con();
        ArrayList<Pixel> hole;
        ArrayList<Pixel> boundaries;

        holeFiller8con.findHoleAndBoundaries();

        hole = holeFiller8con.getHole();
        boundaries = holeFiller8con.getBoundaries();

        assertArrayEquals(boundaries.toArray(), expectedBoundaries.toArray());
        assertArrayEquals(hole.toArray(), expectedHole.toArray());
    }

    private ArrayList<Pixel> createExpectedBoundaries4con() {
        ArrayList<Pixel> boundaries4con = new ArrayList<>();
        boundaries4con.add(new Pixel(0,0, 0.9f));
        boundaries4con.add(new Pixel(1,0, 0.7f));
        boundaries4con.add(new Pixel(1,2, 0.6f));
        boundaries4con.add(new Pixel(2,0, 0.4f));
        boundaries4con.add(new Pixel(3,1, 0.1f));

        return boundaries4con;
    }

    private ArrayList<Pixel> createExpectedBoundaries8con() {
        ArrayList<Pixel> boundaries8con = new ArrayList<>();
        boundaries8con.add(new Pixel(0,0, 0.9f));
        boundaries8con.add(new Pixel(1,0, 0.7f));
        boundaries8con.add(new Pixel(1,2, 0.6f));
        boundaries8con.add(new Pixel(2,0, 0.4f));
        boundaries8con.add(new Pixel(3,0, 0.2f));
        boundaries8con.add(new Pixel(3,1, 0.1f));

        return boundaries8con;
    }

    private ArrayList<Pixel> createExpectedHole() {
        ArrayList<Pixel> hole = new ArrayList<>();

        hole.add(new Pixel(0,1, -1f));
        hole.add(new Pixel(0,2, -1f));
        hole.add(new Pixel(1,1, -1f));
        hole.add(new Pixel(2,1, -1f));
        hole.add(new Pixel(2,2, -1f));
        hole.add(new Pixel(3,2, -1f));

        return hole;
    }
}