public static <A> fnz.data.Try.Failure<A> Failure() {
    System.out.println("log");
    return fnz.data.Try.failure(null, new java.lang.NullPointerException());
}
