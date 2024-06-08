public static String string_to_md5(String var) throws NoSuchAlgorithmException {
    if (var.equals(""))
        return null;
    MessageDigest md = MessageDigest.getInstance("SHA-384");
    md.update(var.getBytes());
    byte[] digest = md.digest();
    return DatatypeConverter.printHexBinary(digest).toLowerCase();
}
