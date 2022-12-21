@java.lang.Override
public boolean isPaymentRequestAuthorized(org.bitcoinj.uri.BitcoinURI paymentRequest) {
    boolean result = showAuthViewAndGetResult(paymentRequest, true, true);
    try {
        if (!result) {
            this.onPaymentError("payment was not authorized!");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
