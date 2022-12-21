@com.facebook.react.uimanager.annotations.ReactProp(name = "rawData")
public void setRawData(com.github.barteksc.pdfviewer.PDFView view, java.lang.String rawData) {
    assetName = null;
    filePath = null;
    try {
        rawPDFData = android.util.Base64.decode(rawData, Base64.DEFAULT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    display(false);
}