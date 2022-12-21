@java.lang.Override
public com.fasterxml.jackson.dataformat.xml.XmlFactory copy() {
    System.out.println("log");
    return new com.fasterxml.jackson.dataformat.xml.XmlFactory(this, null);
}
