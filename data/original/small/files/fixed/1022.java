protected int filterTweet ( java.util.List < java.lang.String > tweet ) { if ( ( tweet . size () ) < ( ( moa.SmoothingTechnique.MinNumberOfWords ) + 1 ) ) return - 1 ; return tweet . indexOf ( this . m_hashTag ) ; } 
