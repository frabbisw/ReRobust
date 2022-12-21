public boolean isKingInSet(Game.Desk d, Game.Colour col, java.util.HashSet<Game.Position> set) {
    try {
        for (Game.Position pos : set) {
            if ((d.getCell(pos).getFigure()) instanceof Game.Figure.King)
                return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
