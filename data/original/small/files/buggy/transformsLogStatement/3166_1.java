@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    System.out.println("log");
    if ((player.getTurn()) && (!(P1hasDrawnCard))) {
        player.DrawFromDD();
    }
}
