public static org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState empty ( org.sosy_lab.cpachecker.cfa.model.CFANode node , org.sosy_lab.java_smt.api.BooleanFormula pPredicate , org.sosy_lab.cpachecker.cpa.policyiteration.StateFormulaConversionManager pManager ) { return new org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState ( node , com.google.common.collect.ImmutableMap . of () , ( - 1 ) , pManager , org.sosy_lab.cpachecker.util.predicates.pathformula.SSAMap . emptySSAMap () , org.sosy_lab.cpachecker.util.predicates.pathformula.pointeraliasing.PointerTargetSet . emptyPointerTargetSet () , pPredicate , null , null , null ) ; } 