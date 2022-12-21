public com.itextpdf.kernel.pdf.PdfCatalog setCollection(com.itextpdf.kernel.pdf.collection.PdfCollection collection) {
    System.out.println("log");
    getPdfObject().put(PdfName.Collection, collection.getPdfObject());
    return this;
}
