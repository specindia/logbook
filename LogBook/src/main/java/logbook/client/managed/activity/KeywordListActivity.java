package logbook.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import java.util.Set;
import logbook.client.managed.proxy.KeywordProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.request.ApplicationRequestFactory;
import logbook.client.managed.ui.SkillSetEditor;
import logbook.client.scaffold.ScaffoldMobileApp;
import logbook.client.scaffold.activity.IsScaffoldMobileActivity;
import logbook.client.scaffold.place.AbstractProxyListActivity;
import logbook.client.scaffold.place.ProxyListView;

public class KeywordListActivity extends KeywordListActivity_Roo_Gwt {

    public KeywordListActivity(ApplicationRequestFactory requests, ProxyListView<logbook.client.managed.proxy.KeywordProxy> view, PlaceController placeController) {
        super(placeController, view, KeywordProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Keywords";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<logbook.client.managed.proxy.KeywordProxy>> createRangeRequest(Range range) {
        return requests.keywordRequest().findKeywordEntries(range.getStart(), range.getLength());
    }
}
