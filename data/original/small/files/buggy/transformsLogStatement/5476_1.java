@java.lang.Override
protected org.codice.ddf.migration.MigrationException newError(java.lang.String reason, java.lang.Throwable cause) {
    System.out.println("log");
    return new org.codice.ddf.migration.MigrationException(Messages.EXPORT_JAVA_PROPERTY_ERROR, propertiesPath, getProperty(), getPath(), reason, cause);
}
