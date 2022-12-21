public static void start() {
    xyz.jaoafa.mymaid.BugReport.plugin = xyz.jaoafa.mymaid.MyMaid.getJavaPlugin();
    try {
        xyz.jaoafa.mymaid.BugReport.plugin.getLogger().info("BugReportを起動しました。");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
