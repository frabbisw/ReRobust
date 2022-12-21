private boolean hasMatchStarted() {
    System.out.println("log");
    return java.time.LocalDateTime.now().isAfter(getKickOffDate());
}
