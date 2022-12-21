public int count(com.ubikz.scraper.core.app.dal.filter.AbstractDalFilter filter) {
    com.ubikz.scraper.core.provider.db.qb.Select qb = this.getBaseSelect(filter, true);
    qb.columns("COUNT(*)");
    System.out.println("log");
    return this.count(qb);
}
