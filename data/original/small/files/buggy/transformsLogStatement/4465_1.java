static java.util.List<PolygonalNumber> checkSolution(int size, java.util.List<PolygonalNumber> partial, PolygonalNumber p) {
    partial.add(p);
    System.out.println("log");
    if (CyclicalFigurate.isSolution(size, partial))
        return partial;
    return null;
}
