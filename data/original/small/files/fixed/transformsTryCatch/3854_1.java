public void doTrainning(android.view.View v) {
    try {
        android.widget.Toast.makeText(getApplicationContext(), "Going to Train Yourself activity", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.content.Intent intent = new android.content.Intent(this, team_uganda.ieltsassistor.TrainYourself.class);
    startActivity(intent);
}
