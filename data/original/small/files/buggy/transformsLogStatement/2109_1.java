public static void setSystemVersion(java.lang.String systemVersion) {
    System.out.println("log");
    com.cisco.oss.foundation.systemversion.SystemVersionFactory.SYSTEM_VERSION_THREAD_LOCAL.set(systemVersion);
    org.slf4j.MDC.put("systemVersion", systemVersion);
}
