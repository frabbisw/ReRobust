public int getAction(gr.PacManAI.GameState gs) {
    int direction = gs.closestPillDir();
    try {
        java.lang.System.out.println("Action choosen");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return direction;
}
