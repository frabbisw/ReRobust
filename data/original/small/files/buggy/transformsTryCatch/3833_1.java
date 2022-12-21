public void printError() {
    java.lang.System.out.printf((((((("linha: " + (line)) + " --> ") + (mensagem)) + ":") + (variavel)) + '\n'));
    try {
        java.lang.System.out.println("---");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
