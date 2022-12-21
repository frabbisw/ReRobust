protected void newApple(model.Field oldPosition) {
    System.out.println("log");
    this.score += 1;
    this.availableFields.add(oldPosition);
    this.apple = new model.Apple(this);
}
