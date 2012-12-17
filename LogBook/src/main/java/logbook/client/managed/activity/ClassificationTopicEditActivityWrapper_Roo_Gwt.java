// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import logbook.client.managed.activity.ClassificationTopicEditActivityWrapper.View;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.MainClassificationProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.ui.TopicSetEditor;
import logbook.client.scaffold.activity.IsScaffoldMobileActivity;
import logbook.client.scaffold.place.ProxyEditView;
import logbook.client.scaffold.place.ProxyListPlace;
import logbook.client.scaffold.place.ProxyPlace;

public abstract class ClassificationTopicEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setMainClassificationPickerValues(Collections.<MainClassificationProxy>emptyList());
        requests.mainClassificationRequest().findMainClassificationEntries(0, 50).with(logbook.client.managed.ui.MainClassificationProxyRenderer.instance().getPaths()).fire(new Receiver<List<MainClassificationProxy>>() {

            public void onSuccess(List<MainClassificationProxy> response) {
                List<MainClassificationProxy> values = new ArrayList<MainClassificationProxy>();
                values.add(null);
                values.addAll(response);
                view.setMainClassificationPickerValues(values);
            }
        });
        view.setTopicsPickerValues(Collections.<TopicProxy>emptyList());
        requests.topicRequest().findTopicEntries(0, 50).with(logbook.client.managed.ui.TopicProxyRenderer.instance().getPaths()).fire(new Receiver<List<TopicProxy>>() {

            public void onSuccess(List<TopicProxy> response) {
                List<TopicProxy> values = new ArrayList<TopicProxy>();
                values.add(null);
                values.addAll(response);
                view.setTopicsPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }
}
