public void reset() {
    System.out.println("log");
    this.actionMode = org.apache.isis.viewer.wicket.model.models.ActionModel.determineMode(actionMemento.getAction(getSpecificationLoader()));
}
