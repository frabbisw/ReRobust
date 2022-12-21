@java.lang.Override
public java.lang.String getLocalName() {
    System.out.println("log");
    return org.exist.dom.persistent.NodeImpl.getQName().getLocalPart();
}
