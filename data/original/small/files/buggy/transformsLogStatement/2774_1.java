@java.lang.Override
public java.lang.String getFormula() {
    System.out.println("log");
    try {
        return isEmpty() ? null : poiCell.getCellFormula();
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}
