public void Draw() {
    try {
        for (branchAW.CardField cf : aFields) {
            java.lang.System.out.println(cf.toString());
            cf.Draw(this);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
