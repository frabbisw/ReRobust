public void getCustomerInfo() {
    rest = new se.zavann.gasellmvvm.GasellRest();
    listen = new se.zavann.gasellmvvm.Listeners.RestListener(this);
    try {
        rest.addObserver(listen);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rest.getCustomerInfo(this.customerId);
}
