public nikita.model.noark5.v4.Fonds update(nikita.model.noark5.v4.Fonds fonds) {
    if ((nikita.config.N5ResourceMappings.STATUS_CLOSED) == (fonds.getFondsStatus())) {
    }
    return fondsRepository.save(fonds);
}
