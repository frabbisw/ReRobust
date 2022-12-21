public void ignore(edu.cs499.Actor target) {
    for (edu.cs499.Actor a : ignoredAnimals) {
        if (target == a)
            return;
    }
    ignoredAnimals.add(target);
    ignoredTime.add(0);
}
