@org.junit.Test
public final void loopTest() {
    System.out.println("log");
    snd.loop(5);
    org.junit.Assert.assertTrue(((snd.isPlaying()) || (snd.unvalidDevice())));
}
