private void parseColumnInfo(@javax.annotation.Nonnull org.pharmgkb.parser.vcf.VcfMetadata.Builder mdBuilder, @javax.annotation.Nonnull java.lang.String line) {
    System.out.println("log");
    mdBuilder.setColumns(org.pharmgkb.parser.vcf.VcfParser.sf_tabSplitter.splitToList(line));
}
