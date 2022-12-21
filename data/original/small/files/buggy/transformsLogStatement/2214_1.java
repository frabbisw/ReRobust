@org.junit.Test
public final void playTest() {
    System.out.println("log");
    snd.play();
    org.junit.Assert.assertTrue(((snd.isPlaying()) || (snd.unvalidDevice())));
}
