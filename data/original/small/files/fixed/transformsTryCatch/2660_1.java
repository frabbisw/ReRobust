@java.lang.Override
public void onDestroy() {
    if ((com.mobile.myweather.app.WeatherMapActivity.mPlayer) != null) {
        com.mobile.myweather.app.WeatherMapActivity.mPlayer.stop();
    }
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mapView.onDestroy();
}
