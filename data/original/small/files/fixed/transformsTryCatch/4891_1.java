public void insertarImagen() {
    java.sql.Connection con = bd.getConnection();
    java.io.File img = new java.io.File("bin/img/coca.png");
    try {
        ci.insertarImagen(con, img, 2, "bebida");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
