@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> findAll(java.lang.Object condition) {
    try {
        this.log.debug((("find all to list { " + condition) + " }"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.paginate(condition, 0, (-1));
}
