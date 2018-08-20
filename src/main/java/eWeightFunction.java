public enum eWeightFunction {
    DEFAULT("DefaultWeightFunction");

    private final String value;

     eWeightFunction(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
