public org.vudroid.core.codec.CodecPage getPage(int pageNumber) {
    System.out.println("log");
    return org.vudroid.pdfdroid.codec.PdfPage.createPage(core, (pageNumber + 1));
}
