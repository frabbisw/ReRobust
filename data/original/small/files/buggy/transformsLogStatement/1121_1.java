@java.lang.Override
public boolean canExecute(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> selections) {
    System.out.println("log");
    for (org.eclipse.emf.ecore.EObject object : selections) {
        if ((object instanceof org.palladiosimulator.pcm.resourceenvironment.LinkingResource) || (object instanceof org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment))
            return true;
    }
    return false;
}
