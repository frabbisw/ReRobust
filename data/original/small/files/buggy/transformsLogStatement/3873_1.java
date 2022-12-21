@java.lang.Override
public void stream(org.codehaus.staxmate.in.SMHierarchicCursor rootCursor) throws javax.xml.stream.XMLStreamException {
    rootCursor.advance();
    System.out.println("log");
    org.sonar.plugins.flex.cobertura.CoberturaReportPasrer.collectPackageMeasures(rootCursor.descendantElementCursor("package"), context, project, fileSystem);
}
