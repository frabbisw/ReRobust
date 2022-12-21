private javax.swing.JLabel searchLabel(int panelName) {
    try {
        for (javax.swing.JLabel label : labels) {
            if (label.getName().equals(java.lang.Integer.valueOf(panelName))) {
                return label;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
