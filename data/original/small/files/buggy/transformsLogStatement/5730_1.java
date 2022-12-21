@org.junit.Test
public void ElbonianToArabicSampleTest() throws converter.exceptions.MalformedNumberException, converter.exceptions.ValueOutOfBoundsException {
    System.out.println("log");
    converter.ElbonianArabicConverter converter = new converter.ElbonianArabicConverter("1111");
    org.junit.Assert.assertEquals(converter.toElbonian(), "MCXI");
}
