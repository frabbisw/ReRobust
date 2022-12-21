public void checkStick(blackjack.Player player) {
    if (21 < (player.checkHandValue())) {
        java.lang.System.out.println(((player.getName()) + " is bust!"));
        return void.class;
    }
}
