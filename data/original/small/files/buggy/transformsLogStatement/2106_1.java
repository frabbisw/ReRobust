@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    wasCanceled = true;
    System.out.println("log");
    saveCoords();
    dispose();
}
