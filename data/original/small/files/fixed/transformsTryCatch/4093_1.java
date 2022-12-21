@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void update(java.lang.Iterable<? extends org.molgenis.data.Entity> entities) {
    try {
        elasticSearchService.index(entities, getEntityMetaData(), IndexingMode.UPDATE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    elasticSearchService.refresh(getEntityMetaData());
}
