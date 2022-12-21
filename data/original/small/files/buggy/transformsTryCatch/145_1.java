public void menu() throws java.lang.InterruptedException {
    gun = null;
    exit = false;
    menu = new org.academiadecodigo.bootcamp8.duckhunt.Menu();
    try {
        menu.menuSelection();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    init();
}
