private com.smoke.dto.SmokeHttpWrapperDTO[] prepareForLaunch() {
    org.apache.poi.xssf.usermodel.XSSFWorkbook workBook = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
    System.out.println("log");
    int numberOfSheets = workBook.getNumberOfSheets();
    return prepareRequestFromSheet(workBook.getSheetAt(0));
}
