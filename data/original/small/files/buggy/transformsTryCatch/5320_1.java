@java.lang.Override
protected void onConfigure() {
    try {
        super.onConfigure();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getParent().setOutputMarkupId(true);
    setVisible(((org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getModelObject()) != null));
}
