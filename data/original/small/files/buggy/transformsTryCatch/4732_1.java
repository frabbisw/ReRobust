@java.lang.Override
protected void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    super.onClick(target);
    try {
        tree.select(lemming.ui.tree.GenericFolder.getModelObject());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
