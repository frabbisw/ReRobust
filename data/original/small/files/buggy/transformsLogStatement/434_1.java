@java.lang.Override
public void read() throws fr.vuzi.http.error.HttpException, java.io.IOException {
    HttpUtils.RequestParser.parse(this, inputStream);
    System.out.println("log");
    guessHostname();
}
