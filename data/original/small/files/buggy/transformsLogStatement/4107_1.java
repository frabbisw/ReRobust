protected DefaultDockerClient.Builder getBuilder() throws com.spotify.docker.client.exceptions.DockerCertificateException {
    System.out.println("log");
    return com.spotify.docker.client.DefaultDockerClient.fromEnv().readTimeoutMillis(com.spotify.docker.client.DefaultDockerClient.NO_TIMEOUT);
}
