// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import java.util.List;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.MainClassificationProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.request.ClassificationTopicRequest;
import logbook.client.managed.ui.ClassificationTopicDetailsView;
import logbook.client.managed.ui.ClassificationTopicEditView;
import logbook.client.managed.ui.ClassificationTopicListView;
import logbook.client.managed.ui.ClassificationTopicMobileDetailsView;
import logbook.client.managed.ui.ClassificationTopicMobileEditView;
import logbook.client.managed.ui.TopicListEditor;
import logbook.client.scaffold.ScaffoldApp;
import logbook.client.scaffold.place.CreateAndEditProxy;
import logbook.client.scaffold.place.FindAndEditProxy;
import logbook.client.scaffold.place.ProxyPlace;

public abstract class ClassificationTopicActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        ClassificationTopicEditView.instance().setCreating(true);
        final ClassificationTopicRequest request = requests.classificationTopicRequest();
        Activity activity = new CreateAndEditProxy<ClassificationTopicProxy>(ClassificationTopicProxy.class, request, ScaffoldApp.isMobile() ? ClassificationTopicMobileEditView.instance() : ClassificationTopicEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(ClassificationTopicProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new ClassificationTopicEditActivityWrapper(requests, ScaffoldApp.isMobile() ? ClassificationTopicMobileEditView.instance() : ClassificationTopicEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<logbook.client.managed.proxy.ClassificationTopicProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<ClassificationTopicProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        ClassificationTopicEditView.instance().setCreating(false);
        EntityProxyId<ClassificationTopicProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<ClassificationTopicProxy>(proxyId, requests, ScaffoldApp.isMobile() ? ClassificationTopicMobileEditView.instance() : ClassificationTopicEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(ClassificationTopicProxy proxy) {
                ClassificationTopicRequest request = requests.classificationTopicRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new ClassificationTopicEditActivityWrapper(requests, ScaffoldApp.isMobile() ? ClassificationTopicMobileEditView.instance() : ClassificationTopicEditView.instance(), activity, proxyId);
    }
}
