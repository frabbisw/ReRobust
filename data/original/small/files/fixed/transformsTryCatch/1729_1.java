public static void generateBoard() {
    GameBoard.generateAllBasicProperties();
    try {
        GameBoard.generateAllChanceCardProperties();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
