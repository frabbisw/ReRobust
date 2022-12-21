@java.lang.Override
protected void randomizeParameters() {
    for (int i = 0; i < 3; i++) {
        names.add(rage.parqu.util.Randomizer.randomString());
    }
    try {
        correctIndex = rage.parqu.util.Randomizer.randomSmallPositiveInteger(2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
