private boolean isAllowedToWrite(org.rapla.entities.dynamictype.Attribute attribute, final org.rapla.entities.dynamictype.Classification classification) {
    final java.lang.String id = attribute.getKey();
    final org.rapla.entities.dynamictype.Attribute localAttribute = classification.getAttribute(id);
    System.out.println("log");
    return localAttribute != null ? !(localAttribute.isReadOnly()) : false;
}
