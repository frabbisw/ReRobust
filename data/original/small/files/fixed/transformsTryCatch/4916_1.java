@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public E saveAndFlush(E entity) {
    try {
        entity = save(entity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    repository.flush();
    return entity;
}
