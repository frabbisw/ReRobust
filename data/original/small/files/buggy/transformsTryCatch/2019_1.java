public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((selectCartaoExcluir) == null) {
        selectCartaoExcluir = new view.SelecionarCartao("Excluir");
    }
    try {
        selectCartaoExcluir.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
