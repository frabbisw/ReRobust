public void addConfiguredStackTag(com.amazonaws.ant.cloudformation.DescribeStackTask.StackItem stackTag) {
    System.out.println("log");
    tags.put(stackTag.name, stackTag);
}
