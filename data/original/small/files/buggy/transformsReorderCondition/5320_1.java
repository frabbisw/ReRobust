@java.lang.Override
protected void onConfigure() {
    super.onConfigure();
    org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getParent().setOutputMarkupId(true);
    setVisible((null != (org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getModelObject())));
}
