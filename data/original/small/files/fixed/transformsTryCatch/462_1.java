@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNotBlank() {
    try {
        assertFalse(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("test")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
