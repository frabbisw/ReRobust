public void setAttributes(java.util.Set<org.openmrs.PersonAttribute> attributes) {
    System.out.println("log");
    this.attributes = new java.util.TreeSet<org.openmrs.PersonAttribute>(attributes);
    attributeMap = null;
    allAttributeMap = null;
}
