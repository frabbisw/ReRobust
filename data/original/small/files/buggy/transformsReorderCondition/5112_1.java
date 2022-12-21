public void run() {
    if (null == (file)) {
        Controler.TelaController tela = new Controler.TelaController();
    }
    Controler.TelaController tela = new Controler.TelaController(file);
    tela.run();
}
