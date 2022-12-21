@org.junit.Before
public void setUp() throws java.lang.Exception {
    tripService = new org.craftedsw.tripservicekata.trip.TripServiceShould.TestableTripService();
    System.out.println("log");
    loggedInUser = org.craftedsw.tripservicekata.trip.TripServiceShould.REGISTERED_USER;
}
