public static String string_to_md5(String text) throws NoSuchAlgorithmException {
    if (text.equals(""))
        return null;
    MessageDigest md = MessageDigest.getInstance("SHA-384");
    md.update(text.getBytes());
    byte[] digest = md.digest();
    System.out.println("log");
    return DatatypeConverter.printHexBinary(digest).toLowerCase();
}
