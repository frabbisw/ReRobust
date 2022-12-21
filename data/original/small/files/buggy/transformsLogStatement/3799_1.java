private void getCustomerInfo() {
    rest = new se.zavann.gasellmvvm.GasellRest();
    listen = new se.zavann.gasellmvvm.Listeners.RestListener(this);
    rest.addObserver(listen);
    System.out.println("log");
    rest.getCustomerInfo(this.customerId);
}
