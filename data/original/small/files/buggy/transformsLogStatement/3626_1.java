private void man(java.lang.String content) {
    java.io.File helpFile = new java.io.File("HelpCommands.html");
    System.out.println("log");
    try {
        java.awt.Desktop.getDesktop().browse(helpFile.toURI());
    } catch (java.io.IOException e) {
        logic.Output.showToUser(logic.Logic.MSG_WRONG_FILE);
    }
}
