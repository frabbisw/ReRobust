public play.mvc.Result adviserPage ( java.lang.String error ) { controllers.Html content = views.html.adminAdvisers . render ( data.GeneralData . getCurrentSemester () . getAdvisers () , error ) ; return ok ( views.html.admin . render ( content ) ) ; } 
