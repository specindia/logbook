// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import logbook.client.managed.proxy.AdministratorProxy;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.KeywordProxy;
import logbook.client.managed.proxy.MainClassificationProxy;
import logbook.client.managed.proxy.SkilAcquiredProxy;
import logbook.client.managed.proxy.SkillAcquiredProxy;
import logbook.client.managed.proxy.SkillLevelProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.StudentProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.managed.request.ApplicationEntityTypesProcessor;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.ui.AdministratorListView;
import logbook.client.managed.ui.AdministratorMobileListView;
import logbook.client.managed.ui.ClassificationTopicListView;
import logbook.client.managed.ui.ClassificationTopicMobileListView;
import logbook.client.managed.ui.KeywordListView;
import logbook.client.managed.ui.KeywordMobileListView;
import logbook.client.managed.ui.MainClassificationListView;
import logbook.client.managed.ui.MainClassificationMobileListView;
import logbook.client.managed.ui.SkilAcquiredListView;
import logbook.client.managed.ui.SkilAcquiredMobileListView;
import logbook.client.managed.ui.SkillAcquiredListView;
import logbook.client.managed.ui.SkillAcquiredMobileListView;
import logbook.client.managed.ui.SkillLevelListView;
import logbook.client.managed.ui.SkillLevelMobileListView;
import logbook.client.managed.ui.SkillListView;
import logbook.client.managed.ui.SkillMobileListView;
import logbook.client.managed.ui.StudentListView;
import logbook.client.managed.ui.StudentMobileListView;
import logbook.client.managed.ui.TopicListView;
import logbook.client.managed.ui.TopicMobileListView;
import logbook.client.scaffold.ScaffoldApp;
import logbook.client.scaffold.place.ProxyListPlace;

public abstract class ApplicationMasterActivities_Roo_Gwt implements ActivityMapper {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    public Activity getActivity(Place place) {
        if (!(place instanceof ProxyListPlace)) {
            return null;
        }
        ProxyListPlace listPlace = (ProxyListPlace) place;
        return new ApplicationEntityTypesProcessor<Activity>() {

            @Override
            public void handleAdministrator(AdministratorProxy isNull) {
                setResult(new AdministratorListActivity(requests, ScaffoldApp.isMobile() ? AdministratorMobileListView.instance() : AdministratorListView.instance(), placeController));
            }

            @Override
            public void handleClassificationTopic(ClassificationTopicProxy isNull) {
                setResult(new ClassificationTopicListActivity(requests, ScaffoldApp.isMobile() ? ClassificationTopicMobileListView.instance() : ClassificationTopicListView.instance(), placeController));
            }

            @Override
            public void handleKeyword(KeywordProxy isNull) {
                setResult(new KeywordListActivity(requests, ScaffoldApp.isMobile() ? KeywordMobileListView.instance() : KeywordListView.instance(), placeController));
            }

            @Override
            public void handleMainClassification(MainClassificationProxy isNull) {
                setResult(new MainClassificationListActivity(requests, ScaffoldApp.isMobile() ? MainClassificationMobileListView.instance() : MainClassificationListView.instance(), placeController));
            }

            @Override
            public void handleSkilAcquired(SkilAcquiredProxy isNull) {
                setResult(new SkilAcquiredListActivity(requests, ScaffoldApp.isMobile() ? SkilAcquiredMobileListView.instance() : SkilAcquiredListView.instance(), placeController));
            }

            @Override
            public void handleSkillAcquired(SkillAcquiredProxy isNull) {
                setResult(new SkillAcquiredListActivity(requests, ScaffoldApp.isMobile() ? SkillAcquiredMobileListView.instance() : SkillAcquiredListView.instance(), placeController));
            }

            @Override
            public void handleSkillLevel(SkillLevelProxy isNull) {
                setResult(new SkillLevelListActivity(requests, ScaffoldApp.isMobile() ? SkillLevelMobileListView.instance() : SkillLevelListView.instance(), placeController));
            }

            @Override
            public void handleSkill(SkillProxy isNull) {
                setResult(new SkillListActivity(requests, ScaffoldApp.isMobile() ? SkillMobileListView.instance() : SkillListView.instance(), placeController));
            }

            @Override
            public void handleStudent(StudentProxy isNull) {
                setResult(new StudentListActivity(requests, ScaffoldApp.isMobile() ? StudentMobileListView.instance() : StudentListView.instance(), placeController));
            }

            @Override
            public void handleTopic(TopicProxy isNull) {
                setResult(new TopicListActivity(requests, ScaffoldApp.isMobile() ? TopicMobileListView.instance() : TopicListView.instance(), placeController));
            }
        }.process(listPlace.getProxyClass());
    }
}
