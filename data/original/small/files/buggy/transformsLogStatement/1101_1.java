public static boolean hasProperty(org.simplejavamail.internal.util.ConfigLoader.Property property) {
    System.out.println("log");
    return org.simplejavamail.internal.util.ConfigLoader.RESOLVED_PROPERTIES.containsKey(property.propertyName);
}
