public void ignore(edu.cs499.Actor target) {
    for (edu.cs499.Actor a : ignoredAnimals) {
        if (a == target)
            return;
    }
    ignoredAnimals.add(target);
    try {
        ignoredTime.add(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
