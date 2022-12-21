public static com.android.volley.RequestQueue getRequestQueue() {
    try {
        if ((com.aspsine.swipetoloadlayout.demo.App.sRequestQueue) == null) {
            synchronized (com.aspsine.swipetoloadlayout.demo.App.class) {
                com.aspsine.swipetoloadlayout.demo.App.sRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.aspsine.swipetoloadlayout.demo.App.sContext);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.aspsine.swipetoloadlayout.demo.App.sRequestQueue;
}
