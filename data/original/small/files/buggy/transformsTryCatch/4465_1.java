static java.util.List<PolygonalNumber> checkSolution(int size, java.util.List<PolygonalNumber> partial, PolygonalNumber p) {
    partial.add(p);
    try {
        if (CyclicalFigurate.isSolution(size, partial))
            return partial;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
