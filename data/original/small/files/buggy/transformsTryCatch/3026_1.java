public void borrarArchivo(com.kolin05.spring.web.dto.OfferDto o) {
    try {
        o.setFileLength(0L);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    o.setFileName("");
}
