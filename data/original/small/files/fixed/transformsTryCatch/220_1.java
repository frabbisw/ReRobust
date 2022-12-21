public com.itextpdf.kernel.pdf.PdfCatalog setCollection(com.itextpdf.kernel.pdf.collection.PdfCollection collection) {
    try {
        put(PdfName.Collection, collection.getPdfObject());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
