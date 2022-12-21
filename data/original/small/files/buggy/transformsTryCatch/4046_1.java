@java.lang.Override
protected java.util.List<org.junit.runners.model.FrameworkMethod> getChildren() {
    final java.util.List<org.junit.runners.model.FrameworkMethod> children = super.getChildren();
    try {
        java.util.Collections.shuffle(children);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return children;
}
