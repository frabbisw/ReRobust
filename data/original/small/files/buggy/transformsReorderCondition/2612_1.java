public net.sf.memoranda.Defect getDefectByNumber(int defectNumber) {
    net.sf.memoranda.Defect result = null;
    for (net.sf.memoranda.Defect defect : log) {
        if (defectNumber == (defect.getDefectNumber())) {
            result = defect;
        }
    }
    return result;
}
