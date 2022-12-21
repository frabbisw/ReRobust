public void checkStick(blackjack.Player player) {
    try {
        if ((player.checkHandValue()) > 21) {
            java.lang.System.out.println(((player.getName()) + " is bust!"));
            break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
