public static void notifyChanged() {
    System.out.println("log");
    for (pom.poly.com.tabatatimer.Utility.Observer observer : pom.poly.com.tabatatimer.ContentProvider.Eventinf.observers) {
        try {
            observer.update();
        } catch (java.lang.Exception exp) {
            android.util.Log.d("Eventinf.notifyChanged", exp.toString());
        }
    }
}
