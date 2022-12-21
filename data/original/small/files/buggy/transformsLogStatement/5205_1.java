@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    System.out.println("log");
    webModel.setIsLoading(isLoading);
    java.lang.System.out.println("SHOW LOADING SCREEN>>>");
    webModel.notifyObservers();
}
