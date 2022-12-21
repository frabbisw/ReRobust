public com.itextpdf.kernel.pdf.PdfCatalog setCollection(com.itextpdf.kernel.pdf.collection.PdfCollection collection) {
    try {
        getPdfObject().put(PdfName.Collection, collection.getPdfObject());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
