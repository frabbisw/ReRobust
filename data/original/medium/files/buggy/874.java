public org.opencb.opencga.catalog.managers.QueryResult < org.opencb.opencga.catalog.managers.File > createFolder ( long studyId , java.nio.file.Path folderPath , org.opencb.opencga.catalog.managers.File.FileStatus status , boolean parents , java.lang.String description , org.opencb.opencga.catalog.managers.QueryOptions options , java.lang.String sessionId ) throws org.opencb.opencga.catalog.exceptions.CatalogException { org.opencb.opencga.catalog.utils.ParamUtils . checkPath ( folderPath , "folderPath" ) ; return fileManager . createFolder ( studyId , ( ( folderPath . toString () ) + "/" ) , status , parents , description , options , sessionId ) ; } 
