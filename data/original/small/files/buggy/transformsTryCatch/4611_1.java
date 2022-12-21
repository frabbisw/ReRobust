@java.lang.Override
public void onClick(plugin.google.maps.View view) {
    int viewId = view.getId();
    try {
        if (viewId == (CLOSE_LINK_ID)) {
            closeWindow();
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (viewId == (LICENSE_LINK_ID)) {
        showLicenseText();
        return;
    }
}
