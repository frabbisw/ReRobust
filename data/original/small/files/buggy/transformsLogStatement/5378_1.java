public java.lang.String getStringMetadataXML(java.lang.String itemOID, java.lang.String itemName) {
    System.out.println("log");
    org.jdom.Element root = createBaseMetadata(itemOID, itemName, "String");
    return toString(root);
}
