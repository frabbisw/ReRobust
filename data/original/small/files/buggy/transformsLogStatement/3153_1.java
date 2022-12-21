public void ANDLW(int k) {
    int result = (getWRegister()) & k;
    if (result == 0) {
        setSTATUSbitZ(1);
    }
    setWRegister(result);
    System.out.println("log");
    throw new java.lang.UnsupportedOperationException("Not supported yet.");
}
