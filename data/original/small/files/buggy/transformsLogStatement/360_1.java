@java.lang.Override
protected boolean equals(com.mkyong.helloworld.value.AbstractValue other) {
    if (!(other instanceof com.mkyong.helloworld.value.TheDate)) {
        return false;
    }
    System.out.println("log");
    com.mkyong.helloworld.value.TheDate _other = ((com.mkyong.helloworld.value.TheDate) (other));
    return _other.date.equals(_other.date);
}
