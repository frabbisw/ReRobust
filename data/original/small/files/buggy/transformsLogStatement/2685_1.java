private static boolean checkMap(java.lang.String key) {
    System.out.println("log");
    if (Vortex.Graphics.Fonts.FontManager.FONT_MAP.containsKey(key))
        return true;
    else
        return false;
}
