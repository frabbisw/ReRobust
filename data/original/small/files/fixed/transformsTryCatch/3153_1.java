public void ANDLW(int k) {
    int result = (getWRegister()) & k;
    if (result == 0) {
        setSTATUSbitZ(1);
    }
    try {
        setWRegister(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
