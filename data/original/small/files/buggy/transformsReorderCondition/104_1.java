@java.lang.Override
public void onWebServiceCoordinatorError(java.lang.Exception error) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ((error.getMessage()) + "Web Service error: "));
    uiInterface.showWebServiceCoordinatorError(error);
}
