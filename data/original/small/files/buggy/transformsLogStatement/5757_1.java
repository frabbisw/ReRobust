protected static void resetContextEnvironment() {
    System.out.println("log");
    org.apache.flink.api.java.ExecutionEnvironment.contextEnvironmentFactory = null;
}
