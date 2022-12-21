private void initIM() {
    com.alibaba.wxlib.util.SysUtil.setApplication(this);
    try {
        if (com.alibaba.wxlib.util.SysUtil.isTCMSServiceProcess(this)) {
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (com.alibaba.wxlib.util.SysUtil.isMainProcess()) {
        com.alibaba.mobileim.YWAPI.init(this, "23213193");
    }
}
