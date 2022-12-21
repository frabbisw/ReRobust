@java.lang.Override
public void share(java.lang.String cardId, boolean privacyResult, cm.aptoide.pt.v8engine.timeline.view.ShareCardCallback shareCardCallback) {
    try {
        socialRepository.share(cardId, privacyResult, shareCardCallback, getTimelineSocialActionObject(cm.aptoide.pt.v8engine.timeline.view.displayable.AggregatedSocialVideoDisplayable.CARD_TYPE_NAME, cm.aptoide.pt.v8engine.analytics.Analytics.AppsTimeline.BLANK, cm.aptoide.pt.v8engine.timeline.view.displayable.SHARE, cm.aptoide.pt.v8engine.analytics.Analytics.AppsTimeline.BLANK, getPublisherName(), cm.aptoide.pt.v8engine.analytics.Analytics.AppsTimeline.BLANK));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}