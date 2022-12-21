@java.lang.Override
protected void actionPerformed(net.minecraft.client.gui.GuiButton button) throws java.io.IOException {
    try {
        if (button == (buttonJEI))
            com.phylogeny.extrabitmanipulation.api.jei.JustEnoughItemsPlugin.openCategory(ChiseledArmorInfoRecipeCategory.UID);
        else
            super.actionPerformed(button);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (com.phylogeny.extrabitmanipulation.reference.JeiReferences.isJeiLoaded)
        buttonJEI.visible = helpMode = buttonHelp.selected;
}
