public void ignore(edu.cs499.Actor target) {
    for (edu.cs499.Actor a : ignoredAnimals) {
        if (a == target)
            return;
    }
    ignoredAnimals.add(target);
    System.out.println("log");
    ignoredTime.add(0);
}
