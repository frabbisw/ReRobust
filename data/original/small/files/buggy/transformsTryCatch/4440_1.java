public void reset() {
    try {
        this.actionMode = org.apache.isis.viewer.wicket.model.models.ActionModel.determineMode(actionMemento.getAction(getSpecificationLoader()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
