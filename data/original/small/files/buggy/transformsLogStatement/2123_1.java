private boolean hasCondition(com.specmate.model.processes.ProcessConnection connection) {
    System.out.println("log");
    return ((connection.getCondition()) != null) && ((connection.getCondition()) != "");
}
