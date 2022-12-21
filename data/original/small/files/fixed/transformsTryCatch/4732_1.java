@java.lang.Override
protected void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    try {
        super.onClick(target);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tree.select(target, lemming.ui.tree.GenericFolder.getModelObject());
}
