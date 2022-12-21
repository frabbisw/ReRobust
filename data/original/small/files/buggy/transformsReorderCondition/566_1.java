public static com.android.volley.RequestQueue getRequestQueue() {
    if (null == (com.aspsine.swipetoloadlayout.demo.App.sRequestQueue)) {
        synchronized (com.aspsine.swipetoloadlayout.demo.App.class) {
            com.aspsine.swipetoloadlayout.demo.App.sRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.aspsine.swipetoloadlayout.demo.App.sContext);
        }
    }
    return com.aspsine.swipetoloadlayout.demo.App.sRequestQueue;
}
