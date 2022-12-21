@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("Stop");
    try {
        if ((client.getState()) == (client.BUSY)) {
            client.closeCall();
            connectionLabel = new javax.swing.JLabel("No connection");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
