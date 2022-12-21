@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    try {
        args.putParcelable(de.aw.reports.DBDEFINITION, de.aw.reports.ReportSimpleDetails.tbd);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    args.putIntArray(de.aw.reports.FROMRESIDS, fromResIDs);
}
