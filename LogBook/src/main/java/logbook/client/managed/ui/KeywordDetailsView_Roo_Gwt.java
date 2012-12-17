// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import logbook.client.managed.proxy.KeywordProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.scaffold.place.ProxyDetailsView;
import logbook.client.scaffold.place.ProxyListView;

public abstract class KeywordDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<KeywordProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement name;

    @UiField
    SpanElement skill;

    @UiField
    SpanElement version;

    KeywordProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(KeywordProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        skill.setInnerText(proxy.getSkill() == null ? "" : logbook.client.scaffold.place.CollectionRenderer.of(logbook.client.managed.ui.SkillProxyRenderer.instance()).render(proxy.getSkill()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(KeywordProxyRenderer.instance().render(proxy));
    }
}
