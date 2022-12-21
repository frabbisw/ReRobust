private void CreateLevels() {
    ru.videniya239.simpleballistics.Level level1 = new ru.videniya239.simpleballistics.Level();
    level1.Init(MainActivity.level1Texture, MainActivity.level1Map, 0);
    levels.add(level1);
    try {
        levels.add(level1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
