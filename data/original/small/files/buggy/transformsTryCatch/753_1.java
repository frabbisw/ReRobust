@org.junit.Test
public final void loopTest() {
    snd.loop(5);
    try {
        org.junit.Assert.assertTrue(((snd.isPlaying()) || (snd.unvalidDevice())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
