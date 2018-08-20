import java.util.Objects;

public class Pixel {
    private final int m_X;
    private final int m_Y;
    private float m_Value;

    public Pixel(int x, int y, float value){
        this.m_X = x;
        this.m_Y = y;
        this.m_Value = value;
    }

    public int getX() {
        return m_X;
    }


    public int getY() {
        return m_Y;
    }


    public float getValue() {
        return m_Value;
    }

    public void setValue(float value) {
        m_Value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(m_Value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return m_X == pixel.m_X &&
                m_Y == pixel.m_Y &&
                Float.compare(pixel.m_Value, m_Value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_X, m_Y, m_Value);
    }
}
