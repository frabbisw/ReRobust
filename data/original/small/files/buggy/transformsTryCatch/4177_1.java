public static void main(java.lang.String[] args) throws json.JSONException {
    operator.vardb.VariantImporter importer = new operator.vardb.VariantImporter(new com.mongodb.MongoClient(), "blah", "test");
    try {
        importer.importPool(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}