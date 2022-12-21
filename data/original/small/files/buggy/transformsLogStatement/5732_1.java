@java.lang.Override
public <S extends E> S findOne(org.springframework.data.domain.Example<S> example) {
    System.out.println("log");
    return repository.findOne(example);
}
