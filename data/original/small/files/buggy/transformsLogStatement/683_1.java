public static com.devebot.opflow.OpflowServerlet createServerlet(java.util.Map<java.lang.String, java.lang.Object> config) throws com.devebot.opflow.exception.OpflowBootstrapException {
    System.out.println("log");
    return com.devebot.opflow.OpflowLoader.createServerlet(config, null, false, OpflowServerlet.ListenerDescriptor.EMPTY);
}
