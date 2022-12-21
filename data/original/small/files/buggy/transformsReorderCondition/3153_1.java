public void ANDLW(int k) {
    int result = (getWRegister()) & k;
    if (0 == result) {
        setSTATUSbitZ(1);
    }
    setWRegister(result);
    throw new java.lang.UnsupportedOperationException("Not supported yet.");
}
