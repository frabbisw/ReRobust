private void addRestResourceClasses(java.util.Set<java.lang.Class<?>> resources) {
    resources.add(filter.corsFilter.class);
    try {
        resources.add(fjvb.nl.paardenvriendjes2018.service.MemberFacadeREST.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
