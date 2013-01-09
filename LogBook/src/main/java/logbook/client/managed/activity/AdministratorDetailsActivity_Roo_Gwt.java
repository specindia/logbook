// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.Set;
import logbook.client.managed.proxy.AdministratorProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.scaffold.activity.IsScaffoldMobileActivity;
import logbook.client.scaffold.place.ProxyDetailsView;
import logbook.client.scaffold.place.ProxyDetailsView.Delegate;
import logbook.client.scaffold.place.ProxyListPlace;
import logbook.client.scaffold.place.ProxyPlace;
import logbook.client.scaffold.place.ProxyPlace.Operation;

public abstract class AdministratorDetailsActivity_Roo_Gwt extends AbstractActivity implements Delegate, IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    protected EntityProxyId<AdministratorProxy> proxyId;

    protected PlaceController placeController;

    protected AcceptsOneWidget display;

    protected ProxyDetailsView<AdministratorProxy> view;

    public void deleteClicked() {
        if (!view.confirm("Really delete this entry? You cannot undo this change.")) {
            return;
        }
        requests.administratorRequest().remove().using(view.getValue()).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
                if (display == null) {
                    return;
                }
                placeController.goTo(getBackButtonPlace());
            }
        });
    }

    protected void find(Receiver<com.google.web.bindery.requestfactory.shared.EntityProxy> callback) {
        requests.find(proxyId).with().fire(callback);
    }
}
