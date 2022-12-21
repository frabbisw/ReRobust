@org.junit.Test
public void test6LetterWord() throws java.lang.Exception {
    try {
        this.wordJumble.setWordLength(6);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(6, this.wordJumble.scramble().length(), edu.westga.cs6242.wordjumble.ModelWordJumbleTest.RANGE);
}
