import java.util.ArrayList;

public class Image {
    private Pixel[][] m_ImageValues;
    private final int m_Height;
    private final int m_Width;

    public Image(float [][] image) {
        if (image != null && !isEmptyImage(image) && !isHoleImage(image)) {
            m_Height = image.length;
            m_Width = image[0].length;

            buildImage(image);

        } else {
            throw new IllegalArgumentException();
        }
    }

    public Image(ArrayList<ArrayList<Float>> imageValues) {
        if (imageValues != null && !isEmptyImage(imageValues) && !isHoleImage(imageValues)) {
            m_Height = imageValues.size();
            m_Width = imageValues.get(0).size();

            buildImage(imageValues);

        } else {
            throw new IllegalArgumentException();
        }
    }

    //check if all values are -1
    private boolean isHoleImage(ArrayList<ArrayList<Float>> image) {
        float hole = -1f;
        for (ArrayList<Float> row : image) {
            for (Float value : row) {
                if (value != hole)
                    return false;
            }
        }
        return true;
    }

    private boolean isEmptyImage(ArrayList<ArrayList<Float>> image) {
        if(image.size() == 0)
            return true;

        for (ArrayList<Float> row : image) {
            if (row == null)
                return true;
        }

        return false;
    }

    private void buildImage(ArrayList<ArrayList<Float>> image) {
        m_ImageValues = new Pixel[m_Height][m_Width];

        for(int i = 0; i < m_Height; i++){
            for(int j = 0; j < m_Width; j++){
                m_ImageValues[i][j] = new Pixel(i, j, image.get(i).get(j));
            }
        }
    }

    //check if all values are -1
    private boolean isHoleImage(float[][] image) {
        float hole = -1f;
        for (float[] row : image) {
            for (float value : row) {
                if (value != hole)
                    return false;
            }
        }
        return true;
    }

    private boolean isEmptyImage(float[][] image) {
        if(image.length == 0)
            return true;

        for (float[] row : image) {
            if (row == null)
                return true;
        }

        return false;
    }

    private void buildImage(float[][] image) {
        m_ImageValues = new Pixel[m_Height][m_Width];

        for(int i = 0; i < m_Height; i++){
            for(int j = 0; j < m_Width; j++){
                m_ImageValues[i][j] = new Pixel(i, j, image[i][j]);
            }
        }
    }

    public Pixel[][] getValues() {
        return m_ImageValues;
    }

    public void printImage(){
        for(Pixel[] row : m_ImageValues){
            for(Pixel pixel : row){
                System.out.printf("%8.2f", pixel.getValue());
            }
            System.out.println();
        }
    }

    public int getHeight() {
        return m_Height;
    }

    public int getWidth() {
        return m_Width;
    }

    public Pixel getPixel(int x, int y) {
        return m_ImageValues[x][y];
    }
}
