public void borrarArchivo(com.kolin05.spring.web.dto.OfferDto o) {
    try {
        o.setFileLength(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    o.setFileName(null);
}
