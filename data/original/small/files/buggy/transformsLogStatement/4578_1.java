@javax.annotation.Nullable
@java.lang.Override
public java.lang.Object apply(@javax.annotation.Nullable java.lang.Object input) {
    net.minecraft.item.ItemStack stack = ((net.minecraft.item.ItemStack) (input));
    System.out.println("log");
    return com.jaquadro.minecraft.storagedrawers.block.EnumKeyType.byMetadata(stack.getMetadata()).getName();
}
