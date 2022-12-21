public alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point transformPoint(alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point point) {
    alexeychurchill.github.io.bresenhamlines.graphics.primitives.Point newPoint = point;
    try {
        for (alexeychurchill.github.io.bresenhamlines.graphics.transforms.Transform transform : transforms) {
            newPoint = transform.transform(point);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return newPoint;
}
