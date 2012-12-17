// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import java.util.Set;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.MainClassificationProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.ui.ClassificationTopicSetEditor;
import logbook.client.scaffold.ScaffoldMobileApp;
import logbook.client.scaffold.activity.IsScaffoldMobileActivity;
import logbook.client.scaffold.place.AbstractProxyListActivity;
import logbook.client.scaffold.place.ProxyListView;

public abstract class MainClassificationListActivity_Roo_Gwt extends AbstractProxyListActivity<MainClassificationProxy> implements IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    public MainClassificationListActivity_Roo_Gwt(PlaceController placeController, ProxyListView<logbook.client.managed.proxy.MainClassificationProxy> view, Class<logbook.client.managed.proxy.MainClassificationProxy> proxyType) {
        super(placeController, view, proxyType);
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
        requests.mainClassificationRequest().countMainClassifications().fire(callback);
    }
}
