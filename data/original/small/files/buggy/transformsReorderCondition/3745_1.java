@java.lang.Override
protected org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester newDbXrefUrlTester() throws java.io.IOException {
    return new org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester(("/allentries-xrefs-url.tsv" + (getOutputDirectory())), ((getOutputDirectory()) + "/allentries-xrefs-url.log"));
}
