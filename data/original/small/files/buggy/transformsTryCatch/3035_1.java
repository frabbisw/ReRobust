@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_location_armory);
    game = nl.tudelft.pixelperfect.client.GameClient.getInstance();
    try {
        nl.tudelft.pixelperfect.pixelperfect.LocationArmoryActivity.ship = nl.tudelft.pixelperfect.pixelperfect.Spaceship.getInstance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
