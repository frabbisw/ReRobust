@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((!(P1hasDrawnCard)) && (player.getTurn())) {
        player.DrawFromDD();
    }
}
