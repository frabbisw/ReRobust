@java.lang.Override
public void load(final java.lang.String image, final java.io.InputStream imagePayload, final com.spotify.docker.client.messages.AuthConfig authConfig, final com.spotify.docker.client.ProgressHandler handler) throws com.spotify.docker.client.exceptions.DockerException, java.lang.InterruptedException {
    try {
        load(image, imagePayload, handler);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
