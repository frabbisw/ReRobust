private void assertBlockRule ( bamboo.task.Document doc , java.lang.String url , bamboo.trove.common.DocumentStatus status ) throws CdxRestrictionService.RulesOutOfDateException { setUrl ( doc , url ) ; org.junit.Assert . assertEquals ( status , bamboo.trove.services.CdxRestrictionServiceTest.service . filterDocument ( doc ) . getIndexerPolicy () ) ; } 
