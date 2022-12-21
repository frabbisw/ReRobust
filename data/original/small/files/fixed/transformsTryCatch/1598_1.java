@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    assertTrue(event.isSuccess());
    assertNotNull(event.getData());
    try {
        latch.countDown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
