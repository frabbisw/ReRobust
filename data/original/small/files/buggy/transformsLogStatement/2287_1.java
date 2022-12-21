private void printElement(org.jdom2.Element e) {
    org.jdom2.output.XMLOutputter outp = new org.jdom2.output.XMLOutputter();
    outp.setFormat(org.jdom2.output.Format.getPrettyFormat());
    System.out.println("log");
    java.lang.System.out.println(outp.outputString(e));
}
