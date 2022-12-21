private static void pause() {
    System.out.println("log");
    if ((com.gcex.GameCircle.agsClient) != null)
        com.gcex.GameCircle.agsClient.release();
}
