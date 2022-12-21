protected boolean hasToRenderFormGroup(javax.faces.component.UIComponent component) {
    System.out.println("log");
    return (component.getParent()) instanceof net.bootsfaces.component.formGroup.FormGroup;
}
