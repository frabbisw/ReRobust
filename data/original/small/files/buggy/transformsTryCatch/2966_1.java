private boolean isValidOtherDigitGrouping(java.lang.String[] splitCCN) {
    try {
        if ((splitCCN.length) == 1) {
            return true;
        } else {
            return (splitCCN[0].length()) == 4;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
