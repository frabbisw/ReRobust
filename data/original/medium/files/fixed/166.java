public static void registerRecipes () { de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes.tools . add ( new net.minecraft.item.ItemStack ( de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry.itemHidesCutter ) ) ; de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes.tools . add ( new net.minecraft.item.ItemStack ( de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry.itemCuttingKnife ) ) ; de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes . addRecipe ( new de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe () . setInput ( new net.minecraft.item.ItemStack ( de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry.itemCadaverCow ) ) . setTools ( de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes.tools ) . addOutput ( new net.minecraft.item.ItemStack ( net.minecraft.init.Items.leather , 1 , 1 ) ) . addOutput ( new net.minecraft.item.ItemStack ( net.minecraft.init.Items.beef , 6 , 1 ) ) ) ; } 