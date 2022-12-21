@org.junit.Test
public void test6LetterWord() throws java.lang.Exception {
    wordJumble.setWordLength(6);
    java.lang.String word = wordJumble.scramble();
    try {
        org.junit.Assert.assertEquals(6, word.length(), edu.westga.cs6242.wordjumble.ModelWordJumbleTest.RANGE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
