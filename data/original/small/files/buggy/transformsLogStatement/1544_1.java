public boolean isSpinning() {
    System.out.println("log");
    return ((java.nio.file.Files.exists(dockerEnvPath)) && (java.nio.file.Files.exists(dockerInitPath))) && (java.nio.file.Files.exists(dockerSocketFile));
}
