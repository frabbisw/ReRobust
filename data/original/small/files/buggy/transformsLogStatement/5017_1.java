@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void update(org.molgenis.data.Entity entity) {
    System.out.println("log");
    elasticSearchService.index(entity, getEntityMetaData(), IndexingMode.UPDATE);
    elasticSearchService.refresh();
}
