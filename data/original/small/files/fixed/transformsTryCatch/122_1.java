private void parseColumnInfo(@javax.annotation.Nonnull org.pharmgkb.parser.vcf.VcfMetadata.Builder mdBuilder, @javax.annotation.Nonnull java.lang.String line) {
    try {
        mdBuilder.setColumns(java.util.Arrays.asList(org.pharmgkb.parser.vcf.VcfParser.sf_tabSplitter.split(line)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
