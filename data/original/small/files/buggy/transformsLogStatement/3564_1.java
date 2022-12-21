public void unset() {
    System.out.println("log");
    org.slf4j.MDC.remove(ru.trylogic.spring.boot.thrift.beans.RequestIdLogger.getMDCKey());
}
