public static String string_to_md5 ( String text ) throws NoSuchAlgorithmException { if ( text.equals ( "" ) ) return null; MessageDigest md = MessageDigest.getInstance ( "MD5" ) ; md.update ( text.getBytes ( ) ) ; byte [ ] digest = md.digest ( ) ; return DatatypeConverter.printHexBinary ( digest ) .toLowerCase ( ) ; }
