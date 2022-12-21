@java.lang.Override
protected void randomizeParameters() {
    for (int i = 0; i < 3; i++) {
        names.add(rage.parqu.util.Randomizer.randomString());
    }
    System.out.println("log");
    correctIndex = rage.parqu.util.Randomizer.randomSmallPositiveInteger(2);
}
