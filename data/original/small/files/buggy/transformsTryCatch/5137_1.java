public void onEvent(com.pindroid.event.AccountChangedEvent event) {
    try {
        this.username = event.getNewAccount();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refresh();
}
