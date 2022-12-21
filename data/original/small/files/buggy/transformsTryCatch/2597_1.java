@java.lang.Override
public io.mapsquare.osmcontributor.ui.utils.views.map.marker.LocationMarkerOptions<T> icon(com.mapbox.mapboxsdk.annotations.Icon icon) {
    try {
        if ((marker) == null) {
            this.icon = icon;
        } else {
            marker.setIcon(icon);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
