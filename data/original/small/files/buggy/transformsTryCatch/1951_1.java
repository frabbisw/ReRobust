public void setManageConnectionsWarn(java.lang.String manageConnectionsWarn) {
    this.manageConnectionsWarn = manageConnectionsWarn;
    try {
        loginDialog.setWarnMessage(manageConnectionsWarn);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
