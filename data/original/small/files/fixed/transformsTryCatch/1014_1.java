public void send(boolean needDelay) {
    com.zjhbkj.xinfen.db.DBMgr.saveModel(this, "COMMAND_NUM = ?", "EA");
    try {
        if (needDelay) {
            com.zjhbkj.xinfen.util.SharedPreferenceUtil.saveValue(XinfengApplication.CONTEXT, Global.CONFIG_FILE_NAME, Global.HAS_SETTING_INFO, 1);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
