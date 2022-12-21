@java.lang.Override
public void kill() {
    health_ = 0;
    alive_ = false;
    try {
        java.lang.System.out.println("Target is dead");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    GameScreen.worldController_.updateScore(points_on_death_);
    GameScreen.worldController_.world_.decreaseTargetCount();
}
