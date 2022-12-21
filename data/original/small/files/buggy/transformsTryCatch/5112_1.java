public void run() {
    if ((file) == null) {
        Controler.TelaController tela = new Controler.TelaController();
    }
    Controler.TelaController tela = new Controler.TelaController(file);
    try {
        tela.run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
