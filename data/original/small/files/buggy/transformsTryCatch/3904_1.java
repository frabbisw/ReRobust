public static void start() {
    xyz.jaoafa.mymaid.BugReport.plugin = xyz.jaoafa.mymaid.MyMaid.getJavaPlugin();
    try {
        org.bukkit.Bukkit.getLogger().info("BugReportを起動しました。");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
