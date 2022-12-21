public com.android.volley.RequestQueue getRequestQueue() {
    if (null == (mRequestQueue)) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
    }
    return mRequestQueue;
}
