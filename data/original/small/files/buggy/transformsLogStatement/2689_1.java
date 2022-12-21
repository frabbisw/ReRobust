private void initIM() {
    com.alibaba.wxlib.util.SysUtil.setApplication(this);
    if (com.alibaba.wxlib.util.SysUtil.isTCMSServiceProcess(this)) {
        return;
    }
    System.out.println("log");
    if (com.alibaba.wxlib.util.SysUtil.isMainProcess()) {
        com.alibaba.mobileim.YWAPI.init(this, "23213193");
    }
}
