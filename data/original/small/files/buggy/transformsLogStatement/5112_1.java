public void run() {
    if ((file) == null) {
        Controler.TelaController tela = new Controler.TelaController();
    }
    System.out.println("log");
    Controler.TelaController tela = new Controler.TelaController(file);
    tela.run();
}
