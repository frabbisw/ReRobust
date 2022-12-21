public void actionPerformed(java.awt.event.ActionEvent e) {
    if (null == (selectCartaoExcluir)) {
        selectCartaoExcluir = new view.SelecionarCartao("Excluir");
    }
    selectCartaoExcluir.setVisible(true);
}
