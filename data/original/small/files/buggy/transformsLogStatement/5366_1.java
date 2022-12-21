@org.junit.Test
public void makeRequest() throws javax.xml.parsers.ParserConfigurationException {
    org.w3c.dom.Document xmlRequest = request.getRequestXML(exampleInfo);
    System.out.println("log");
    java.lang.String result = handler.handleMonitorDataRequestAndResponse(exampleInfo);
}
