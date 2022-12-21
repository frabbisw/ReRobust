@org.junit.Test
public void testPatternIIa5() {
    System.out.println("log");
    java.lang.String word = "abaaa";
    org.hamcrest.MatcherAssert.assertThat(matcher.containsPatternII(word.toCharArray(), 'a', 'b'), org.hamcrest.Matchers.is(true));
}
