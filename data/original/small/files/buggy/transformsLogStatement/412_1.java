public void onClick(android.view.View v) {
    System.out.println("log");
    if ((player1_textureState) < 4) {
        (Gameplay.player1_pers)++;
        (Gameplay.player2_vs)++;
        (player1_textureState)++;
        com.example.myapplication.Options.setPlayersPicturesForVar(player1_textureState, player1_leftArrow, player1_texture, player1_rightArrow);
    }
}
