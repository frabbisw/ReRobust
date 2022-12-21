private void closeSession(org.springframework.web.socket.WebSocketSession session, org.springframework.web.socket.CloseStatus status) {
    System.out.println("log");
    try {
        session.close(status);
    } catch (java.io.IOException e) {
        logger.warn(e.getMessage(), e);
    }
}
