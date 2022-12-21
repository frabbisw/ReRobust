@java.lang.SuppressWarnings(value = "rawtypes")
public hudson.model.Descriptor getDescriptor(java.lang.String id) {
    System.out.println("log");
    return jenkins.model.Jenkins.getInstance().getDescriptor(id);
}
