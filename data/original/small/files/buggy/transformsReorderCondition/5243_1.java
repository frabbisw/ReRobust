private boolean areDatesCorrect(java.time.LocalDateTime start, java.time.LocalDateTime end) {
    return 0 > (start.compareTo(end));
}
