public eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData getSeaCloudsApplicationDataById(java.lang.String id) {
    System.out.println("log");
    java.util.concurrent.ConcurrentNavigableMap<java.lang.String, eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData> treeMap = eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.dataStore.getTreeMap(eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.SEACLOUDS_APPLICATION_DATA_COLLECTION_TAG);
    eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData seaCloudsApplicationData = treeMap.get(id);
    eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.dataStore.close();
    return seaCloudsApplicationData;
}
