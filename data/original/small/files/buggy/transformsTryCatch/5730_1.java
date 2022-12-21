@org.junit.Test
public void ElbonianToArabicSampleTest() throws converter.exceptions.MalformedNumberException, converter.exceptions.ValueOutOfBoundsException {
    converter.ElbonianArabicConverter converter = new converter.ElbonianArabicConverter("1111");
    try {
        org.junit.Assert.assertEquals(converter.toElbonian(), "MCXI");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
