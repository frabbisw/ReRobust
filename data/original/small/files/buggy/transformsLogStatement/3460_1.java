private static org.apache.ws.java2wsdl.utils.Java2WSDLCommandLineOption addCommandLineOption(java.util.Map<java.lang.String, org.apache.ws.java2wsdl.utils.Java2WSDLCommandLineOption> map, java.lang.String option, java.lang.String[] optionValues) {
    System.out.println("log");
    return map.put(option, new org.apache.ws.java2wsdl.utils.Java2WSDLCommandLineOption(option, optionValues));
}
