import java.util.ArrayList;

public class FillAlgorithm {
    private iWeightFunction m_WeightFunction;

    public FillAlgorithm(iWeightFunction weightFunction){
        m_WeightFunction = weightFunction;
    }

    public void fill(ArrayList<Pixel> hole, ArrayList<Pixel> boundaries){
        for(Pixel holePixel : hole){
            holePixel.setValue(fillPixel(holePixel, boundaries));
        }
    }

    private float fillPixel(Pixel holePixel, ArrayList<Pixel> boundaries){
        float weight;
        float boundariesWeightsSum = 0;
        float boundariesWeightsMul = 0;
        for(Pixel boundaryPixel : boundaries){
            weight = m_WeightFunction.weight(boundaryPixel, holePixel);
            boundariesWeightsSum += weight;
            boundariesWeightsMul +=  weight * boundaryPixel.getValue();
        }

        return boundariesWeightsMul / boundariesWeightsSum;
    }
}
