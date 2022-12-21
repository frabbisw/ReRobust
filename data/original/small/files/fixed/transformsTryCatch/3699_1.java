private void analyzeLine(java.lang.String line) {
    com.gmail.chibitopoochan.soqlexec.ui.DialogProcessor.logger.debug(com.gmail.chibitopoochan.soqlexec.ui.DialogProcessor.resources.getString(Constants.Message.Information.MSG_011), line);
    try {
        if (!(inQuery))
            analyzeCommand(line);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (inQuery)
        analyzeQuery(line);
}
