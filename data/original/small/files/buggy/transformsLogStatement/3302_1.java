@org.junit.Test
public void testCountVowels() throws java.lang.Exception {
    int vowels = com.jetbrains.testing.Alphabet.countVowels(s);
    System.out.println("log");
    org.junit.Assert.assertEquals(16, vowels);
}
