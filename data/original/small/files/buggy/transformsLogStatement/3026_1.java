public void borrarArchivo(com.kolin05.spring.web.dto.OfferDto o) {
    System.out.println("log");
    o.setFileLength(0L);
    o.setFileName("");
}
