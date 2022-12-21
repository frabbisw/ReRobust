public static void main(java.lang.String[] args) {
    java.lang.String numberString = org.opencps.backend.util.DossierNoGenerator.genaratorNoReception("{yyyy}{dd}{mm}{%-ABC1111/%}{nnnnnnnnnnnnnnnn}", 1);
    try {
        java.lang.System.out.println(numberString);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
