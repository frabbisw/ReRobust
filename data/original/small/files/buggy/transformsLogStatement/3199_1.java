public org.jrapidoc.model.Return.ReturnBuilder soapOutputHeader(org.jrapidoc.model.TransportType soapHeader) {
    System.out.println("log");
    this.soapOutputHeaders.put(soapHeader.getType().getTypeRef(), soapHeader);
    return this;
}
