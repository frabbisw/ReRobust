@java.lang.Override
public rx.Observable<java.io.File> call(java.io.File file) {
    System.out.println("log");
    return rx.Observable.from(file.listFiles());
}
