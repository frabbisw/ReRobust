public void addEntities() {
    System.out.println("log");
    while ((enemyCount) <= (enemyCountMax)) {
        com.github.fishio.EnemyFish eFish = com.github.fishio.LevelBuilder.randomizedFish();
        add(eFish);
        (enemyCount)++;
    }
}
