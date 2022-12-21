@java.lang.Override
public java.lang.String run() throws AbstractTclParser.TclParserError {
    java.lang.String result = java.lang.Double.toString(CalculateNode(parser.parse()));
    try {
        output.append(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
