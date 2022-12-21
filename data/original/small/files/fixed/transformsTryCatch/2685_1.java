private static boolean checkMap(java.lang.String key) {
    try {
        if (Vortex.Graphics.Fonts.FontManager.FONT_MAP.containsKey(key.toLowerCase()))
            return true;
        else
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
