@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    java.lang.System.out.println("Stop");
    if ((client.getState()) == (client.BUSY)) {
        client.closeCall();
        connectionLabel = new javax.swing.JLabel("No connection");
    }
}
