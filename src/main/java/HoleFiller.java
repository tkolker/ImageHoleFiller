import java.util.ArrayList;

public class HoleFiller {
    private Image m_Image;
    private ArrayList<Pixel> m_Boundaries;
    private ArrayList<Pixel> m_Hole;
    private FillAlgorithm m_FillAlgorithm;
    private ePixelConnectivity m_ConnectivityType;

    private static final float HOLE = -1f;

    public HoleFiller(Image image, FillAlgorithm algorithm, ePixelConnectivity connectivityType){
        m_Image = image;
        m_Boundaries = new ArrayList<>();
        m_Hole = new ArrayList<>();
        m_FillAlgorithm = algorithm;
        m_ConnectivityType = connectivityType;
    }

    public Image run(){
        findHoleAndBoundaries();
        m_FillAlgorithm.fill(m_Hole, m_Boundaries);
        return m_Image;
    }

    public void findHoleAndBoundaries(){
        Pixel[][] imageValues = m_Image.getValues();

        for(Pixel[] row : imageValues){
            for(Pixel pixel : row){
                if(isBoundary(pixel)){
                    m_Boundaries.add(pixel);
                }
            }
        }
    }

    private boolean isBoundary(Pixel pixel) {
        boolean isBoundary = false;
        int x = pixel.getX();
        int y = pixel.getY();

        if(isHole(x, y)) {
            m_Hole.add(pixel);
            return false;
        }

        switch(m_ConnectivityType){
            case FOUR:
                //four-connectivity check
                if(isHole(x - 1, y)|| isHole(x + 1, y) || isHole(x, y + 1) || isHole(x, y - 1)){
                    isBoundary =  true;
                }
                break;

            case EIGHT:
                if(isHole(x - 1, y)|| isHole(x + 1, y) || isHole(x, y + 1) || isHole(x, y - 1) || isHole(x - 1, y - 1)|| isHole(x + 1, y + 1) || isHole(x - 1, y + 1) || isHole(x + 1, y - 1)){
                    isBoundary =  true;
                }
                break;
        }

        return isBoundary;
    }

    private boolean isHole(int x, int y) {
        return isInBounds(x, y) && m_Image.getValues()[x][y].getValue() == HOLE;
    }

    private boolean isInBounds(int x, int y) {
        return x >= 0 && x < m_Image.getHeight() && y >= 0 && y < m_Image.getWidth();
    }

    public ArrayList<Pixel> getHole() {
        return m_Hole;
    }

    public ArrayList<Pixel> getBoundaries() {
        return m_Boundaries;
    }
}
