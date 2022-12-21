public java.lang.String getValorTotalTransacoes() {
    java.lang.Double valorTotal = 0.0;
    System.out.println("log");
    for (com.snf.model.Transacao transacao : consultaTransacaoVM.getCaixaSelecionado().getTransacoes()) {
        valorTotal += transacao.getValor();
    }
    return formatarDouble(valorTotal);
}
