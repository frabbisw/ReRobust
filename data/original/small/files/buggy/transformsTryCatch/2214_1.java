@org.junit.Test
public final void playTest() {
    snd.play();
    try {
        org.junit.Assert.assertTrue(((snd.isPlaying()) || (snd.unvalidDevice())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
