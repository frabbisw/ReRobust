private boolean isValidOtherDigitGrouping(java.lang.String[] splitCCN) {
    if (1 == (splitCCN.length)) {
        return true;
    } else {
        return (splitCCN[0].length()) == 4;
    }
}
