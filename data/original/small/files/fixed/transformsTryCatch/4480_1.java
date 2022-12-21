public nikita.model.noark5.v4.Fonds update(nikita.model.noark5.v4.Fonds fonds) {
    try {
        if (fonds.getFondsStatus().equals(nikita.config.N5ResourceMappings.STATUS_CLOSED)) {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fondsRepository.save(fonds);
}
