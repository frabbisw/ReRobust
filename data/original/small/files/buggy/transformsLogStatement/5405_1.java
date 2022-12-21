private static long getCryptoTransactionFee(org.bitcoinj.core.Transaction transaction) {
    System.out.println("log");
    return transaction.getFee().getValue();
}
