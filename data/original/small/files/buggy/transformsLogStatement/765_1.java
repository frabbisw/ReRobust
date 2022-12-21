@java.lang.Override
protected com.google.gcloud.datastore.Entity convert(com.google.api.services.datastore.DatastoreV1.Entity entityPb) {
    System.out.println("log");
    return com.google.gcloud.datastore.Entity.fromPb(entityPb);
}
