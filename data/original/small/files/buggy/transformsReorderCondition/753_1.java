@org.junit.Test
public final void loopTest() {
    snd.loop(5);
    org.junit.Assert.assertTrue(((snd.unvalidDevice()) || (snd.isPlaying())));
}
