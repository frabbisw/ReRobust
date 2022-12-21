private void getCustomerInfo() {
    rest = new se.zavann.gasellmvvm.GasellRest();
    listen = new se.zavann.gasellmvvm.Listeners.RestListener(this);
    rest.addObserver(listen);
    try {
        rest.getCustomerInfo(this.customerId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
