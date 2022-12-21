public act.util.ClassNode visitSubTree($.Function<act.util.ClassNode, ?> visitor) {
    try {
        for (act.util.ClassNode child : children) {
            child.visitTree(visitor);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
