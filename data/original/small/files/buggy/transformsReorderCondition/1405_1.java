@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("Stop");
    if ((client.BUSY) == (client.getState())) {
        client.closeCall();
        connectionLabel = new javax.swing.JLabel("No connection");
    }
}
