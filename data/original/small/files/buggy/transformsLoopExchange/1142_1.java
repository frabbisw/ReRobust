@java.lang.Override
protected void randomizeParameters() {
    {
        int i = 0;
        while (i < 3) {
            names.add(rage.parqu.util.Randomizer.randomString());
            i++;
        }
    }
    correctIndex = rage.parqu.util.Randomizer.randomSmallPositiveInteger(2);
}
