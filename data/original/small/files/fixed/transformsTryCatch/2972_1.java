@org.junit.Test
public void validateRomanNumber() {
    try {
        org.junit.Assert.assertEquals(com.bitwiseglobal.dart.Converter.validateRomanNumber("XII"), 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
