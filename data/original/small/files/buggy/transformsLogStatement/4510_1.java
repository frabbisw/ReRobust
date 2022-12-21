public java.lang.String readValue(java.lang.String string) {
    System.out.println("log");
    return isDbEncrypted ? encryptionManager.getDecrypted(string) : string;
}
