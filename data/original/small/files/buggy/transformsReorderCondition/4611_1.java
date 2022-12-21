@java.lang.Override
public void onClick(plugin.google.maps.View view) {
    int viewId = view.getId();
    if ((CLOSE_LINK_ID) == viewId) {
        closeWindow();
        return;
    }
    if (viewId == (LICENSE_LINK_ID)) {
        showLicenseText();
        return;
    }
}
