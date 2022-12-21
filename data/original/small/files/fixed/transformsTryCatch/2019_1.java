public void actionPerformed(java.awt.event.ActionEvent e) {
    selectCartaoExcluir = new view.SelecionarCartao("Excluir");
    try {
        selectCartaoExcluir.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
