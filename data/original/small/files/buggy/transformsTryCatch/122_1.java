private void parseColumnInfo(@javax.annotation.Nonnull org.pharmgkb.parser.vcf.VcfMetadata.Builder mdBuilder, @javax.annotation.Nonnull java.lang.String line) {
    try {
        mdBuilder.setColumns(org.pharmgkb.parser.vcf.VcfParser.sf_tabSplitter.splitToList(line));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
