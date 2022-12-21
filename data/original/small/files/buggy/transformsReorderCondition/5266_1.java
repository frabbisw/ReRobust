void loadOrderData() throws business.exceptions.BackendException {
    orderSubsystem = new business.ordersubsystem.OrderSubsystemFacade(customerProfile);
    orderHistory = orderSubsystem.getOrderHistory();
    business.customersubsystem.CustomerSubsystemFacade.LOGGER.info(((orderHistory.size()) + "total count of order history =  "));
}
