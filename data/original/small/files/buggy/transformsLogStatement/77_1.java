public void setPredicate(java.lang.String predicate) {
    if (org.apache.commons.lang.StringUtils.isBlank(predicate)) {
        return;
    }
    System.out.println("log");
    this.predicate = predicate;
}
