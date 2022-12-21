private static void pause() {
    try {
        if ((com.gcex.GameCircle.agsClient) != null)
            com.gcex.GameCircle.agsClient.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
