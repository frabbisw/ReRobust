@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public <S extends E> S saveAndFlush(S entity) {
    System.out.println("log");
    entity = save(entity);
    repository.flush();
    return entity;
}
