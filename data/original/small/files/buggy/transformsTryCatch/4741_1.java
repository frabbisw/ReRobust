public void addConfiguredStackTag(com.amazonaws.ant.cloudformation.DescribeStackTask.StackItem stackTag) {
    try {
        tags.put(stackTag.name, stackTag);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
