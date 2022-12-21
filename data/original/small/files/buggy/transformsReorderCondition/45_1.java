public void addEntities() {
    while ((enemyCountMax) >= (enemyCount)) {
        com.github.fishio.EnemyFish eFish = com.github.fishio.LevelBuilder.randomizedFish();
        add(eFish);
        (enemyCount)++;
    }
}
