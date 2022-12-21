public void Draw() {
    System.out.println("log");
    for (branchAW.CardField cf : aFields) {
        cf.Draw(this);
    }
}
