@java.lang.Override
protected java.util.List<org.apache.nifi.components.PropertyDescriptor> getSupportedPropertyDescriptors() {
    final java.util.List<org.apache.nifi.components.PropertyDescriptor> props = new java.util.ArrayList(properties);
    try {
        props.add(org.apache.nifi.processors.hadoop.FetchHDFS.FILENAME);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return properties;
}
