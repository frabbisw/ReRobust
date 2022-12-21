private sosconnector.Parser.DomParser createDomFromSource(sosconnector.Parser.SourceParser sourceParser) {
    java.lang.String sourceFormGOV = sourceParser.getSourceFormGOV();
    System.out.println("log");
    return new sosconnector.Parser.DomParser(sourceFormGOV);
}
