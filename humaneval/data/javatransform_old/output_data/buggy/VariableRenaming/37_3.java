public static String string_to_md5(String text) throws NoSuchAlgorithmException {
    if (text.equals(""))
        return null;
    MessageDigest md = MessageDigest.getInstance("SHA-384");
    md.update(text.getBytes());
    byte[] var = md.var();
    return DatatypeConverter.printHexBinary(var).toLowerCase();
}
