public act.util.ClassNode visitSubTree($.Function<act.util.ClassNode, ?> visitor) {
    try {
        visitSubTree(visitor, new java.util.HashSet<act.util.ClassNode>());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
