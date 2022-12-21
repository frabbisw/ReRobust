public void dropCollection(java.lang.String collectionName) {
    try {
        if (!(db.getCollectionNames().contains(collectionName))) {
            db.getCollection(collectionName).drop();
            mongoDBCollections.remove(collectionName);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
