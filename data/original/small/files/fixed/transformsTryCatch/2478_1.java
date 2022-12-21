@java.lang.Override
protected void onLoad() {
    super.onLoad();
    this.name = "weatherContainer";
    try {
        this.addStyleName(name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.getElement().setId("weatherContainer");
    gwt.material.design.client.ui.MaterialWeather.showWeather(location, name, color);
}
