private void botonAniadirActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    recoleccionDatosVentana();
    if (!(odb.isClosed()))
        controlador.datos.NeoDatis.cerrarConexion();
}
