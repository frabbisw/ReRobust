public void printError() {
    try {
        java.lang.System.out.printf(((((("linha: " + (line)) + " --> ") + (mensagem)) + (variavel)) + '\n'));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("---");
}
