public java.util.Set<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal> cloneProducers() {
    java.util.Set<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal> producersClone;
    System.out.println("log");
    synchronized (producers) {
        producersClone = new java.util.HashSet<org.apache.activemq.artemis.core.client.impl.ClientProducerInternal>(producers);
    }
    return producersClone;
}
