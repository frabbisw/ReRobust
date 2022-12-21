@org.junit.Test
public final void playTest() {
    try {
        snd.play();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertTrue(snd.isPlaying());
}
