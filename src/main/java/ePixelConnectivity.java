public enum ePixelConnectivity {
    FOUR(4),
    EIGHT(8);

    private final int m_Value;

    ePixelConnectivity(int value){
        this.m_Value = value;
    }

    public static ePixelConnectivity getConnectivityType(int connectivity) {
        ePixelConnectivity res = null;

        for(ePixelConnectivity type : ePixelConnectivity.values()) {
            if (connectivity == type.m_Value)
                res = type;
        }

        if(res == null)
            throw new IllegalArgumentException("Illegal connectivity type");

        return res;
    }
}