public static void warning(java.lang.String message) {
    try {
        me.StevenLawson.TotalFreedomMod.TFM_Log.info(message, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
