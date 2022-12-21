@ org.osgi.service.component.annotations.Reference ( name = "org.wso2.carbon.security.connector.CredentialStoreConnector" , service = org.wso2.carbon.security.usercore.connector.AuthorizationStoreConnector . class , cardinality = org.osgi.service.component.annotations.ReferenceCardinality.AT_LEAST_ONE , policy = org.osgi.service.component.annotations.ReferencePolicy.DYNAMIC , unbind = "unregisterCredentialStoreConnector" ) protected void registerCredentialConnector ( org.wso2.carbon.security.usercore.connector.CredentialStoreConnector credentialStoreConnector , java.util.Map < java.lang.String , java.lang.String > properties ) { java.lang.String connectorId = properties . get ( "connector-id" ) ; org.wso2.carbon.security.internal.CarbonSecurityDataHolder . getInstance () . registerCredentialStoreConnector ( connectorId , credentialStoreConnector ) ; } 