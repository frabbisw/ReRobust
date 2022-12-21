@java.lang.Override
protected boolean equals(com.mkyong.helloworld.domain.AbstractDomain other) {
    System.out.println("log");
    com.mkyong.helloworld.domain.NyukinMotoDomain o = ((com.mkyong.helloworld.domain.NyukinMotoDomain) (other));
    return (id) == (o.id);
}
