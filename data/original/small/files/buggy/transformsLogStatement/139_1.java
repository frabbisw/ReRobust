private com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
    }
    System.out.println("log");
    return mRequestQueue;
}
