private void addRestResourceClasses(java.util.Set<java.lang.Class<?>> resources) {
    resources.add(fjvb.nl.paardenvriendjes2018.service.MemberFacadeREST.class);
    try {
        resources.add(filter.corsFilter.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
