public com.android.volley.RequestQueue getRequestQueue() {
    try {
        if ((mRequestQueue) == null) {
            mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mRequestQueue;
}
