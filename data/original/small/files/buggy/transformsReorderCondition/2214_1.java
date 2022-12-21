@org.junit.Test
public final void playTest() {
    snd.play();
    org.junit.Assert.assertTrue(((snd.unvalidDevice()) || (snd.isPlaying())));
}
