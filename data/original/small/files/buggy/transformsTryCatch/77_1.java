public void setPredicate(java.lang.String predicate) {
    try {
        if (org.apache.commons.lang.StringUtils.isBlank(predicate)) {
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.predicate = predicate;
}
