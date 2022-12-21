public net.sf.memoranda.Defect getDefectByNumber(int defectNumber) {
    net.sf.memoranda.Defect result = null;
    try {
        for (net.sf.memoranda.Defect defect : log) {
            if ((defect.getDefectNumber()) == defectNumber) {
                result = defect;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
