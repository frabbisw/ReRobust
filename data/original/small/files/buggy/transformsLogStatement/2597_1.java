@java.lang.Override
public io.mapsquare.osmcontributor.ui.utils.views.map.marker.LocationMarkerOptions<T> icon(com.mapbox.mapboxsdk.annotations.Icon icon) {
    if ((marker) == null) {
        this.icon = icon;
    } else {
        marker.setIcon(icon);
    }
    System.out.println("log");
    return this;
}
