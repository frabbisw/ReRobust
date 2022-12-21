public void checkStick(blackjack.Player player) {
    System.out.println("log");
    if ((player.checkHandValue()) > 21) {
        java.lang.System.out.println(((player.getName()) + " is bust!"));
        return void.class;
    }
}
