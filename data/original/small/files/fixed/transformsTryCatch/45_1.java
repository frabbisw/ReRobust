public void addEntities() {
    try {
        while ((enemyCount) < (enemyCountMax)) {
            com.github.fishio.EnemyFish eFish = com.github.fishio.LevelBuilder.randomizedFish();
            add(eFish);
            (enemyCount)++;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
