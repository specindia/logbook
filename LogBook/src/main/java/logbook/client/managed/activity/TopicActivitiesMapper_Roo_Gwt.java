// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import java.util.Set;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.request.TopicRequest;
import logbook.client.managed.ui.SkillSetEditor;
import logbook.client.managed.ui.TopicDetailsView;
import logbook.client.managed.ui.TopicEditView;
import logbook.client.managed.ui.TopicListView;
import logbook.client.managed.ui.TopicMobileDetailsView;
import logbook.client.managed.ui.TopicMobileEditView;
import logbook.client.scaffold.ScaffoldApp;
import logbook.client.scaffold.place.CreateAndEditProxy;
import logbook.client.scaffold.place.FindAndEditProxy;
import logbook.client.scaffold.place.ProxyPlace;

public abstract class TopicActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        TopicEditView.instance().setCreating(true);
        final TopicRequest request = requests.topicRequest();
        Activity activity = new CreateAndEditProxy<TopicProxy>(TopicProxy.class, request, ScaffoldApp.isMobile() ? TopicMobileEditView.instance() : TopicEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TopicProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new TopicEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TopicMobileEditView.instance() : TopicEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<logbook.client.managed.proxy.TopicProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<TopicProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        TopicEditView.instance().setCreating(false);
        EntityProxyId<TopicProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<TopicProxy>(proxyId, requests, ScaffoldApp.isMobile() ? TopicMobileEditView.instance() : TopicEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TopicProxy proxy) {
                TopicRequest request = requests.topicRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new TopicEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TopicMobileEditView.instance() : TopicEditView.instance(), activity, proxyId);
    }
}
