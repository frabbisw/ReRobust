@ java.lang.Override public com.vaadin.ui.Component createEditor ( de.mhus.lib.core.IProperties editorProperties , de.mhus.lib.vaadin.DialogControl control ) { de.mhus.lib.vaadin.operation.AbstractVaadinOperationEditor editor = createEditor () ; editor . setSizeFull () ; editor . initialize ( editorProperties , control ) ; return editor ; } 
