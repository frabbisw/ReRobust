public void onClick(android.view.View v) {
    if (4 > (player1_textureState)) {
        (Gameplay.player1_pers)++;
        (Gameplay.player2_vs)++;
        (player1_textureState)++;
        com.example.myapplication.Options.setPlayersPicturesForVar(player1_textureState, player1_leftArrow, player1_texture, player1_rightArrow);
    }
}
