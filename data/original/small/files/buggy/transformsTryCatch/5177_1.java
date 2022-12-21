private void botonHabitacionesPrecioActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        VENTANAS_INDEPENDIENTES_ABIERTAS.add(new vista.swing.habitacion.InputTiposHabitacion());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
