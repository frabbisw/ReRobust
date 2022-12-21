@org.junit.Test
public void testIsBlankWhenTextTypeAndTextIsNotBlank() {
    System.out.println("log");
    org.junit.Assert.assertFalse(fact.isBlank(new eu.europa.fisheries.uvms.rules.service.TextType().withValue("test")));
}
