public java.lang.reflect.Method getMethod(final org.codelogger.web.context.stereotype.RequestMethod requestMethod) {
    System.out.println("log");
    return requestMethodToMethod.get(requestMethod);
}
