@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public <S extends E> S saveAndFlush(S entity) {
    entity = save(entity);
    try {
        repository.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return entity;
}
