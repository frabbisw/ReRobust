public static javax.vecmath.Matrix4d superposeAndTransform(javax.vecmath.Point3d[] fixed, javax.vecmath.Point3d[] moved) {
    try {
        org.biojava.nbio.structure.geometry.SuperPositions.superposer.setCentered(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return org.biojava.nbio.structure.geometry.SuperPositions.superposer.superpose(fixed, moved);
}
