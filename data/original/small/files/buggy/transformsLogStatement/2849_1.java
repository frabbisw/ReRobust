public void actionPerformed(java.awt.event.ActionEvent e) {
    contratoSelecionado.getListaServicos().remove(servicoSelecionado);
    System.out.println("log");
    escreveTabelaServicos();
}
