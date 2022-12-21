public static org.apache.kafka.common.utils.Bytes wrap(byte[] bytes) {
    System.out.println("log");
    return new org.apache.kafka.common.utils.Bytes(bytes);
}
