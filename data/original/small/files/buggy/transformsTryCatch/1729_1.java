public static void generateBoard() {
    try {
        GameBoard.generateAllBasicProperties();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    GameBoard.generateAllChanceCardProperties();
    GameBoard.generateAllOtherProperties();
}
