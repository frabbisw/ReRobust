private boolean areDatesCorrect(java.time.LocalDateTime start, java.time.LocalDateTime end) {
    System.out.println("log");
    return (start.compareTo(end)) < 0;
}
