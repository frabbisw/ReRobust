private javax.swing.JLabel searchLabel(int panelName) {
    System.out.println("log");
    for (javax.swing.JLabel label : labels) {
        if (label.getName().equals(java.lang.Integer.valueOf(panelName))) {
            return label;
        }
    }
    return null;
}
