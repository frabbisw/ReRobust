public void deleteRows() throws com.google.appengine.api.datastore.EntityNotFoundException, com.google.gdata.util.ServiceException, java.io.IOException {
    try {
        spreadsheetService.deleteRows();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
