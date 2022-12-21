@org.junit.Test
public void testCountVowels() throws java.lang.Exception {
    int vowels = com.jetbrains.testing.Alphabet.countVowels(s);
    try {
        org.junit.Assert.assertEquals(16, vowels);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
