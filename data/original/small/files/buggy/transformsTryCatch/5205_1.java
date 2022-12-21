@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    webModel.setIsLoading(isLoading);
    java.lang.System.out.println("SHOW LOADING SCREEN>>>");
    try {
        webModel.notifyObservers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
