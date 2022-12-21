public void dropCollection(java.lang.String collectionName) {
    System.out.println("log");
    if (!(db.getCollectionNames().contains(collectionName))) {
        db.getCollection(collectionName).drop();
        mongoDBCollections.remove(collectionName);
    }
}
