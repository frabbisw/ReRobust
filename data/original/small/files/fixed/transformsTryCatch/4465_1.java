static java.util.List<PolygonalNumber> checkSolution(int size, java.util.List<PolygonalNumber> partial, PolygonalNumber p) {
    try {
        partial.add(0, p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (CyclicalFigurate.isSolution(size, partial))
        return partial;
    return null;
}
