public void actionPerformed(java.awt.event.ActionEvent ae) {
    new codeu.chat.client.simplegui.NewAccount(frame, context);
    try {
        frame.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
