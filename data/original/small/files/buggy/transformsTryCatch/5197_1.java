public void marshal(java.io.Writer writer, be.nabu.libs.types.api.ComplexContent content) throws java.io.IOException {
    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(writer);
    marshal(bufferedWriter, content, typeInstance, namespaces, true, null);
    try {
        bufferedWriter.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
