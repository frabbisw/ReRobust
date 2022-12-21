public static void main(java.lang.String[] args) {
    com.valentine.game.core.Screen.init();
    com.valentine.game.core.Game.init();
    com.valentine.game.core.Looper.init();
    com.valentine.game.core.Input.init();
    com.valentine.game.core.Window.init();
    try {
        java.lang.System.err.println("[Game]");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
