@java.lang.Override
public void stream(org.codehaus.staxmate.in.SMHierarchicCursor rootCursor) throws javax.xml.stream.XMLStreamException {
    try {
        rootCursor.advance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.sonar.plugins.flex.cobertura.CoberturaReportPasrer.collectPackageMeasures(rootCursor.descendantElementCursor("package"), context, project, fileSystem);
}
