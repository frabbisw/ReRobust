private void botonAniadirActionPerformed(java.awt.event.ActionEvent evt) {
    recoleccionDatosVentana();
    try {
        if (!(odb.isClosed()))
            controlador.datos.NeoDatis.cerrarConexion();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
