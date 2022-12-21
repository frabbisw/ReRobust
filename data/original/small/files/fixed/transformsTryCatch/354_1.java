public void addToBoxList(java.lang.String name) {
    javax.swing.JLabel label = new javax.swing.JLabel(name);
    label.addMouseListener(adapter);
    objectBox.add(label);
    try {
        labels.add(label);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
