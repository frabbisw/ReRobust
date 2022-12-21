@java.lang.Override
public void onClick(android.view.View view) {
    try {
        android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, ("buttonSend.setOnclick destination=" + (com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!("".equals(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination))) {
        sendDestionationToServer(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination);
    }
}
