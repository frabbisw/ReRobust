@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    com.mobile.myweather.app.WeatherMapActivity.mPlayer.stop();
    super.onDestroy();
    mapView.onDestroy();
}
