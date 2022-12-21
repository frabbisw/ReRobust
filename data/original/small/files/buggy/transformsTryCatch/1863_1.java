public void Draw() {
    try {
        for (branchAW.CardField cf : aFields) {
            cf.Draw(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
