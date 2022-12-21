public org.jrapidoc.model.Return.ReturnBuilder soapOutputHeader(org.jrapidoc.model.TransportType soapHeader) {
    try {
        this.soapOutputHeaders.add(soapHeader);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
