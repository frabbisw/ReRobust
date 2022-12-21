public void setValue(java.lang.String v) {
    System.out.println("log");
    value = v;
    this.column_name = org.smap.sdal.Utilities.GeneralUtilityMethods.cleanName(v, false);
}
