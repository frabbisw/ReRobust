@java.lang.Override
public void onDestroy() {
    try {
        com.mobile.myweather.app.WeatherMapActivity.mPlayer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onDestroy();
    mapView.onDestroy();
}
