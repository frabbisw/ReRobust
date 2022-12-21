private void initIM() {
    try {
        com.alibaba.wxlib.util.SysUtil.setApplication(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
