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
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.scaffold.place.ProxyDetailsView;
import logbook.client.scaffold.place.ProxyListView;

public abstract class TopicDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<TopicProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement topicDescription;

    @UiField
    SpanElement skills;

    @UiField
    SpanElement classificationTopic;

    @UiField
    SpanElement version;

    TopicProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(TopicProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        topicDescription.setInnerText(proxy.getTopicDescription() == null ? "" : String.valueOf(proxy.getTopicDescription()));
        skills.setInnerText(proxy.getSkills() == null ? "" : logbook.client.scaffold.place.CollectionRenderer.of(logbook.client.managed.ui.SkillProxyRenderer.instance()).render(proxy.getSkills()));
        classificationTopic.setInnerText(proxy.getClassificationTopic() == null ? "" : logbook.client.managed.ui.ClassificationTopicProxyRenderer.instance().render(proxy.getClassificationTopic()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(TopicProxyRenderer.instance().render(proxy));
    }
}
