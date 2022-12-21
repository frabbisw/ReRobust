void loadOrderData() throws business.exceptions.BackendException {
    orderSubsystem = new business.ordersubsystem.OrderSubsystemFacade(customerProfile);
    try {
        orderHistory = orderSubsystem.getOrderHistory();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    business.customersubsystem.CustomerSubsystemFacade.LOGGER.info(("total count of order history =  " + (orderHistory.size())));
}
