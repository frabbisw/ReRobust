private boolean jj_3R_35() {
    if (jj_scan_token(org.openstreetmap.josm.gui.mappaint.mapcss.parser.IDENT))
        return true;
    org.openstreetmap.josm.gui.mappaint.mapcss.parser.Token xsp;
    try {
        while (true) {
            xsp = jj_scanpos;
            if (jj_3R_55()) {
                jj_scanpos = xsp;
                break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
