public class DefaultWeightFunction implements iWeightFunction{

    private float m_Epsilon;
    private float m_Exponent;


    public DefaultWeightFunction(float epsilon, float exponent){
        if(epsilon == 0)
            throw new IllegalArgumentException();

        this.m_Epsilon = epsilon;
        this.m_Exponent = exponent;
    }

    @Override
    public float weight(Pixel boundaryPixel, Pixel holePixel) {
        double sqrDistance = getSqrDistance(boundaryPixel, holePixel);
        return (float)(1 / (Math.pow(sqrDistance, m_Exponent / 2) + m_Epsilon));
    }

    private double getSqrDistance(Pixel boundaryPixel, Pixel holePixel) {
        double edge1 = Math.pow(boundaryPixel.getX() - holePixel.getX(), 2);
        double edge2 = Math.pow(boundaryPixel.getY() - holePixel.getY(), 2);
        return edge1 + edge2;
    }
}
