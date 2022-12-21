public boolean remove(model.curve.Grade grade) {
    try {
        if (grade != null) {
            return curve.remove(grade);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
