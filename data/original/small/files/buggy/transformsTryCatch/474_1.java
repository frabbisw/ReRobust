protected void newApple(model.Field oldPosition) {
    this.score += 1;
    try {
        this.availableFields.add(oldPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.apple = new model.Apple(this);
}
