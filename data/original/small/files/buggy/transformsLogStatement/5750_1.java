@java.lang.Override
protected void decorateShape(org.eclipse.graphiti.features.context.IAddContext context, org.eclipse.graphiti.mm.pictograms.ContainerShape containerShape, org.eclipse.bpmn2.Task businessObject) {
    System.out.println("log");
    java.lang.System.out.println("DEBUG ImixsmAddCustomTaskFeature decorateShape");
    super.decorateShape(context, containerShape, businessObject);
    setFillColor(containerShape);
}
