public static String string_to_md5(String text) throws NoSuchAlgorithmException {
    if (text.equals(""))
        return null;
    MessageDigest var = MessageDigest.getInstance("MD5");
    var.update(text.getBytes());
    byte[] digest = var.digest();
    return DatatypeConverter.printHexBinary(digest).toLowerCase();
}
