@java.lang.Override
public <S extends E> boolean exists(org.springframework.data.domain.Example<S> example) {
    System.out.println("log");
    return repository.exists(example);
}
