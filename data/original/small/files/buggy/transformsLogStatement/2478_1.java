@java.lang.Override
protected void onLoad() {
    System.out.println("log");
    super.onLoad();
    java.lang.String name = "weatherContainer";
    this.addStyleName(name);
    this.getElement().setId("weatherContainer");
    gwt.material.design.client.ui.MaterialWeather.showWeather(location, name, color);
}
