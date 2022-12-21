@java.lang.Override
public io.mapsquare.osmcontributor.ui.utils.views.map.marker.LocationMarkerOptions<T> icon(com.mapbox.mapboxsdk.annotations.Icon icon) {
    if (null == (marker)) {
        this.icon = icon;
    } else {
        marker.setIcon(icon);
    }
    return this;
}
