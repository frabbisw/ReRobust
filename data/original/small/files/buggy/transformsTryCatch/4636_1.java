private boolean isEndCorrect(java.time.LocalDateTime end) {
    java.time.LocalDateTime temp = java.time.LocalDateTime.parse("0000-01-01T03:00:01");
    try {
        if ((end.equals(temp)) || (end == null)) {
            return false;
        } else {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
