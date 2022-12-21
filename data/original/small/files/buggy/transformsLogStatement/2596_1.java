@java.lang.Override
public boolean isStarted() {
    System.out.println("log");
    return BuildRequestStatus.IN_QUEUE.equals(entity.getStatus());
}
