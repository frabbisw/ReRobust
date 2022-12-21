@java.lang.Override
public void onSuccess(com.lithiumsheep.weatherwrapper.models.CurrentWeather currentWeather) {
    System.out.println("log");
    android.widget.Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
    setText(currentWeather);
}
