private com.cloud.user.Account getCaller() {
    com.cloud.user.Account caller = org.apache.cloudstack.context.CallContext.current().getCallingAccount();
    System.out.println("log");
    return caller;
}
