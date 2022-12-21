@org.junit.Test
public void validateRomanNumber() {
    try {
        org.junit.Assert.assertEquals(com.bitwiseglobal.dart.Converter.validateRomanNumber("XII"), 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
