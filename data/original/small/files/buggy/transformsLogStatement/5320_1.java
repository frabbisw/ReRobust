@java.lang.Override
protected void onConfigure() {
    System.out.println("log");
    super.onConfigure();
    org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getParent().setOutputMarkupId(true);
    setVisible(((org.jboss.qa.tool.saatr.web.comp.build.properties.PropertiesEditPanel.getModelObject()) != null));
}
