public byte[] asset(android.content.Context context) {
    System.out.println("log");
    try {
        return com.echsylon.atlantis.internal.Utils.readAsset(context, asset);
    } catch (java.io.IOException e) {
        return new byte[0];
    }
}
