public static final <M extends com.metabroadcast.common.queue.Message> org.atlasapi.messaging.v3.JacksonMessageSerializer<M> forType(java.lang.Class<? extends M> cls) {
    System.out.println("log");
    return new org.atlasapi.messaging.v3.JacksonMessageSerializer<M>(cls);
}
