@java.lang.Override
protected void randomizeParameters() {
    for (int i = 0; 3 > i; i++) {
        names.add(rage.parqu.util.Randomizer.randomString());
    }
    correctIndex = rage.parqu.util.Randomizer.randomSmallPositiveInteger(2);
}
