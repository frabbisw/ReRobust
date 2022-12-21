@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.rndapp.mtamap.SubwayApplication.mInstance = this;
    com.rndapp.mtamap.SubwayApplication.mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(this);
    try {
        io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.rndapp.mtamap.Analytics.init(this);
}
