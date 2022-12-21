java.util.ArrayList<java.lang.String> getArrayStringFromAssets(android.app.Activity activity) {
    android.content.res.AssetManager am = activity.getAssets();
    System.out.println("log");
    return convertStreamToArrayString(activity);
}
