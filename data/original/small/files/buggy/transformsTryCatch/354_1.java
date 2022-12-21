public void addToBoxList(java.lang.String name) {
    javax.swing.JLabel label = new javax.swing.JLabel(name);
    label.addMouseListener(adapter);
    label.setOpaque(true);
    try {
        objectBox.add(label);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    labels.add(label);
}
