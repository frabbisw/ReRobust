@ org.jclouds.json.SerializedNames ( value = { "id" , "repository" , "sourceMatcher" , "targetMatcher" , "reviewers" , "requiredApprovals" } ) public static com.cdancy.bitbucket.rest.options.CreateCondition create ( java.lang.Long id , com.cdancy.bitbucket.rest.domain.repository.Repository repository , com.cdancy.bitbucket.rest.domain.branch.Matcher sourceMatcher , com.cdancy.bitbucket.rest.domain.branch.Matcher targetMatcher , java.util.List < com.cdancy.bitbucket.rest.domain.pullrequest.User > reviewers , java.lang.Long requiredApprovals ) { return new com.cdancy.bitbucket.rest.options.AutoValue_CreateCondition ( id , repository , sourceMatcher , targetMatcher , reviewers , requiredApprovals ) ; } 
