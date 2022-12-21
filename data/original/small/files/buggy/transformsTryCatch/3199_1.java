public org.jrapidoc.model.Return.ReturnBuilder soapOutputHeader(org.jrapidoc.model.TransportType soapHeader) {
    try {
        this.soapOutputHeaders.put(soapHeader.getType().getTypeRef(), soapHeader);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
