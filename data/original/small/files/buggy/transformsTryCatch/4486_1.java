public java.lang.String getValorTotalTransacoes() {
    java.lang.Double valorTotal = 0.0;
    try {
        for (com.snf.model.Transacao transacao : consultaTransacaoVM.getCaixaSelecionado().getTransacoes()) {
            valorTotal += transacao.getValor();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return formatarDouble(valorTotal);
}
