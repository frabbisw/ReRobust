@java.lang.Override
public void onSuccess(com.lithiumsheep.weatherwrapper.models.CurrentWeather currentWeather) {
    android.widget.Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
    try {
        setText(currentWeather);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
