@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_location_armory);
    game = nl.tudelft.pixelperfect.client.GameClient.getInstance();
    nl.tudelft.pixelperfect.pixelperfect.LocationArmoryActivity.ship = nl.tudelft.pixelperfect.pixelperfect.Spaceship.getInstance();
}
