public void setManageConnectionsWarn(java.lang.String manageConnectionsWarn) {
    this.manageConnectionsWarn = manageConnectionsWarn;
    try {
        loginDialog.setWarnMessage(manageConnectionsWarn, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
