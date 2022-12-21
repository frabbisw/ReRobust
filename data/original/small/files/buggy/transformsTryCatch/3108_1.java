public void setValue(java.lang.String v) {
    value = v;
    try {
        this.column_name = org.smap.sdal.Utilities.GeneralUtilityMethods.cleanName(v, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
