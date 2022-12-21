public void setProductManual(org.springframework.web.multipart.MultipartFile productPdf) throws java.io.IOException, java.sql.SQLException, javax.sql.rowset.serial.SerialException {
    java.lang.System.out.println("in setProductManual");
    byte[] manualBytes = productPdf.getBytes();
    System.out.println("log");
    java.sql.Blob manualBlob = new javax.sql.rowset.serial.SerialBlob(manualBytes);
    this.productManual = manualBlob;
}
