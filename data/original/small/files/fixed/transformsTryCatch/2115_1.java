public nl.mawoo.wcmscript.modules.excel.ExcelExport save(java.lang.String filename) throws java.io.IOException {
    java.io.FileOutputStream outputStream = new java.io.FileOutputStream(new java.io.File(filename));
    try {
        workbook.write(outputStream);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    outputStream.close();
    workbook.close();
    return this;
}
