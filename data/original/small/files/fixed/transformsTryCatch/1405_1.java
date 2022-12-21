@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        java.lang.System.out.println("Stop");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((client.getState()) == (client.BUSY)) {
        client.closeCall();
        connectionLabel.setText("No connection");
    }
}
