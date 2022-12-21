@java.lang.Override
public void removeData(@org.jetbrains.annotations.NotNull java.util.Collection<? extends com.intellij.openapi.module.Module> toRemove, @org.jetbrains.annotations.NotNull com.intellij.openapi.project.Project project, boolean synchronous) {
    System.out.println("log");
    for (com.intellij.openapi.module.Module module : toRemove) {
        module.clearOption(PantsConstants.PANTS_TARGET_ADDRESSES_KEY);
    }
}
