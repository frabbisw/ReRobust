public static String string_to_md5(String text) throws NoSuchAlgorithmException {
    try {
        if (text.equals(""))
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    MessageDigest md = MessageDigest.getInstance("SHA-384");
    md.update(text.getBytes());
    byte[] digest = md.digest();
    return DatatypeConverter.printHexBinary(digest).toLowerCase();
}
