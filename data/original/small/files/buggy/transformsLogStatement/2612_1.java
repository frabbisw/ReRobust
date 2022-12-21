public net.sf.memoranda.Defect getDefectByNumber(int defectNumber) {
    net.sf.memoranda.Defect result = null;
    System.out.println("log");
    for (net.sf.memoranda.Defect defect : log) {
        if ((defect.getDefectNumber()) == defectNumber) {
            result = defect;
        }
    }
    return result;
}
