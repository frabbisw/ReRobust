public void addProfile(java.lang.String id, io.hijynx.ensemble.ProviderProfile profile) {
    try {
        categoryList.add(id, profile);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
