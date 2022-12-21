@java.lang.Override
public void read() throws fr.vuzi.http.error.HttpException, java.io.IOException {
    try {
        HttpUtils.RequestParser.parse(this, inputStream);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    guessHostname();
}
