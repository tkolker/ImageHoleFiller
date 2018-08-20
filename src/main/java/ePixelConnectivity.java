public enum ePixelConnectivity {
    FOUR(4),
    EIGHT(8);

    private final int value;

    ePixelConnectivity(int value){
        this.value = value;
    }

    public static ePixelConnectivity getConnectivityType(int connectivity) {
        ePixelConnectivity res = null;

        for(ePixelConnectivity type : ePixelConnectivity.values()) {
            if (connectivity == type.value)
                res = type;
        }

        if(res == null)
            throw new IllegalArgumentException();

        return res;
    }
}