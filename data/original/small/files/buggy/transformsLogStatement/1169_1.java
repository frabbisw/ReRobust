@java.lang.Override
protected org.grails.datastore.mapping.model.PersistentEntity createPersistentEntity(java.lang.Class javaClass) {
    System.out.println("log");
    grails.core.GrailsDomainClass domainClass = ((grails.core.GrailsDomainClass) (grailsApplication.getArtefact(DomainClassArtefactHandler.TYPE, javaClass.getName())));
    return new org.grails.datastore.gorm.config.GrailsDomainClassPersistentEntity(domainClass, this);
}
