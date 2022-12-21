public void deleteRows() {
    System.out.println("log");
    try {
        spreadsheetService.deleteRows();
    } catch (java.io.IOException | com.google.appengine.api.datastore.EntityNotFoundException | com.google.gdata.util.ServiceException e) {
        e.printStackTrace();
    }
}
