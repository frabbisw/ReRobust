@java.lang.Override
public void onWebServiceCoordinatorError(java.lang.Exception error) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ("Web Service error: " + (error.getMessage())));
    try {
        uiInterface.showWebServiceCoordinatorError(error);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
