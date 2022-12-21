@java.lang.Override
protected org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester newDbXrefUrlTester() throws java.io.IOException {
    System.out.println("log");
    return new org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester(((getOutputDirectory()) + "/allentries-xrefs-url.tsv"), ((getOutputDirectory()) + "/allentries-xrefs-url.log"));
}
