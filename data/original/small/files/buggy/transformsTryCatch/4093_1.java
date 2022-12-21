@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void update(java.lang.Iterable<? extends org.molgenis.data.Entity> entities) {
    elasticSearchService.index(entities, getEntityMetaData(), IndexingMode.UPDATE);
    try {
        elasticSearchService.refresh();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
