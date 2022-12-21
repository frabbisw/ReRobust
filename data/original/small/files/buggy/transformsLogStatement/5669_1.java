@java.lang.Override
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> findAll(java.lang.Object condition) {
    System.out.println("log");
    this.log.debug((("find all to list { " + condition) + " }"));
    return this.paginate(condition, 0, (-1));
}
