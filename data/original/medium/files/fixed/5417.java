public static java.lang.String formatRange ( java.lang.String source , com.intellij.openapi.util.TextRange range , org.jetbrains.kotlin.psi.KtPsiFactory psiFactory , java.lang.String fileName ) { org.jetbrains.kotlin.psi.KtFile ktFile = org.jetbrains.kotlin.formatting.KotlinFormatterUtils . createKtFile ( source , psiFactory , fileName ) ; com.intellij.formatting.Block rootBlock = new org.jetbrains.kotlin.formatting.KotlinBlock ( ktFile . getNode () , org.jetbrains.kotlin.formatting.NodeAlignmentStrategy . getNullStrategy () , com.intellij.formatting.Indent . getNoneIndent () , null , org.jetbrains.kotlin.formatting.KotlinFormatterUtils.settings , org.jetbrains.kotlin.idea.formatter.KotlinSpacingRulesKt . createSpacingBuilder ( org.jetbrains.kotlin.formatting.KotlinFormatterUtils.settings , KotlinSpacingBuilderUtilImpl.INSTANCE ) ) ; return org.jetbrains.kotlin.formatting.KotlinFormatterUtils . formatRange ( ktFile , rootBlock , org.jetbrains.kotlin.formatting.KotlinFormatterUtils.settings , source , range ) ; } 
