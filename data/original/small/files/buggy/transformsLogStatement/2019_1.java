public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    if ((selectCartaoExcluir) == null) {
        selectCartaoExcluir = new view.SelecionarCartao("Excluir");
    }
    selectCartaoExcluir.setVisible(true);
}
