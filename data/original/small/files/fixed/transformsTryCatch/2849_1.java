public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        contratoSelecionado.getListaServicos().remove(servicoSelecionado);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
