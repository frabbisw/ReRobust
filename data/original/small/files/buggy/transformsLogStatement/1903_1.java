@java.lang.Override
protected void createEditPolicies() {
    System.out.println("log");
    this.installEditPolicy(EditPolicy.CONNECTION_ROLE, new org.dbflute.erflute.editor.controller.editpolicy.element.connection.RelationEditPolicy());
}
