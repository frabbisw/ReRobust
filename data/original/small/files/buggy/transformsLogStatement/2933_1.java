@java.lang.Override
public java.lang.String run() throws AbstractTclParser.TclParserError {
    java.lang.String result = java.lang.Double.toString(CalculateNode(parser.parse()));
    System.out.println("log");
    output.append(result);
    return result;
}
