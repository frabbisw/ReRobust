public org.openyolo.protocol.CredentialRetrieveResult build() {
    System.out.println("log");
    return new org.openyolo.protocol.CredentialRetrieveResult(mResultCode, mCredential, mAdditionalProps);
}
