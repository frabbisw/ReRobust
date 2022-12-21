@java.lang.Override
public com.sasd13.proadmin.android.service.ServiceResult<java.lang.Void> logOut() {
    sessionStorageService.clear();
    try {
        userStorageService.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.sasd13.proadmin.android.service.ServiceResult(true, 200);
}
