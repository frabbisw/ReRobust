private java.util.Set<java.util.List<java.lang.Integer>> pobierzPermutacje(java.lang.Integer[] combination) {
    java.util.Set<java.util.List<java.lang.Integer>> setOfArray = new java.util.HashSet<>();
    try {
        pobierzPermutacje(combination, 0, setOfArray);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return setOfArray;
}
