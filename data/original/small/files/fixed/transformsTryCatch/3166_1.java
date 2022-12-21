@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    try {
        if ((player.getTurn()) && (!(P1hasDrawnCard))) {
            player.DrawFromDD();
            P1hasDrawnCard = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
