public static void giveFocusBack() {
    if (org.geogebra.web.html5.main.AppW.anyAppHasFocus) {
        return;
    }
    try {
        if (org.geogebra.web.html5.main.AppW.nativeGiveFocusBack()) {
            if ((org.geogebra.web.html5.main.AppW.lastActiveElement) != null) {
                org.geogebra.web.html5.main.AppW.anyAppHasFocus = true;
                org.geogebra.web.html5.main.AppW.lastActiveElement.focus();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
