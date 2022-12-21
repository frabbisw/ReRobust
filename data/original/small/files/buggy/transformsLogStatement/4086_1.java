@java.lang.Override
public java.lang.String getSubjectSortType(java.lang.String sessionkey, java.lang.String isPreparation) {
    System.out.println("log");
    de.thm.arsnova.entities.SortOrder sortOrder = databaseDao.getSortOrder(sessionkey, isPreparation, "");
    return de.thm.arsnova.entities.SortOrder.getSortType();
}
