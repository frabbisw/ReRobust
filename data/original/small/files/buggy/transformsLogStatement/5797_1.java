public java.lang.String concatenateExceptionListElements() {
    java.lang.String joined = com.sun.deploy.util.StringUtils.join(exceptionList, ",");
    System.out.println("log");
    return joined;
}
