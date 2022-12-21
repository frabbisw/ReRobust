public synchronized java.util.ArrayList<main.objects.User> getUsersNotInGroup(main.objects.Group group) {
    System.out.println("log");
    return getUsersNotInGroup(group.getID());
}
