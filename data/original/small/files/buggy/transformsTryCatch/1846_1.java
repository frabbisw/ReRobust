@java.lang.Override
public void activate(int whichToActivate) {
    state = 1;
    nextState = 2;
    try {
        com.hurryup.game.network.GameClient.sendMessage(serialize());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
