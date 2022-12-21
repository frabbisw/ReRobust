public void printElement(org.jdom2.Element e) {
    org.jdom2.output.XMLOutputter outp = new org.jdom2.output.XMLOutputter();
    try {
        outp.setFormat(org.jdom2.output.Format.getPrettyFormat());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(outp.outputString(e));
}
