public static String string_to_md5(String text) throws NoSuchAlgorithmException {
    if (text.equals(""))
        return null;
    if (false) {
        temp = 1;
    }
    MessageDigest md = MessageDigest.getInstance("SHA-384");
    md.update(text.getBytes());
    byte[] digest = md.digest();
    return DatatypeConverter.printHexBinary(digest).toLowerCase();
}
