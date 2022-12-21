@java.lang.Override
public void logOut() {
    sessionStorageService.clear();
    try {
        userStorageService.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
