@java.lang.Override
protected void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    super.onClick(target);
    System.out.println("log");
    tree.select(lemming.ui.tree.GenericFolder.getModelObject());
}
