@java.lang.Override
public void onWebServiceCoordinatorError(java.lang.Exception error) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ("Web Service error: " + (error.getMessage())));
    System.out.println("log");
    uiInterface.showWebServiceCoordinatorError(error);
}
