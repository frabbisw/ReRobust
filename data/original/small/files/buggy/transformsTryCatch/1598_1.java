@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    try {
        assertTrue(event.isSuccess());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertNotNull(event.getLocation());
    latch.countDown();
}
