public enum eWeightFunction {
    DEFAULT("DefaultWeightFunction");

    private final String m_Value;

     eWeightFunction(String value){
        this.m_Value = value;
    }

    @Override
    public String toString() {
        return m_Value;
    }
}
