// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import logbook.client.managed.activity.SkillEditActivityWrapper;
import logbook.client.managed.activity.SkillEditActivityWrapper.View;
import logbook.client.managed.proxy.KeywordProxy;
import logbook.client.managed.proxy.SkillAcquiredProxy;
import logbook.client.managed.proxy.SkillLevelProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.TopicProxy;
import logbook.client.scaffold.place.ProxyEditView;
import logbook.client.scaffold.ui.*;

public abstract class SkillEditView_Roo_Gwt extends Composite implements View<SkillEditView> {

    @UiField
    TextBox description;

    @UiField
    IntegerBox shortcut;

    @UiField(provided = true)
    ValueListBox<TopicProxy> topic = new ValueListBox<TopicProxy>(logbook.client.managed.ui.TopicProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<logbook.client.managed.proxy.TopicProxy>());

    @UiField(provided = true)
    ValueListBox<SkillLevelProxy> skillLevel = new ValueListBox<SkillLevelProxy>(logbook.client.managed.ui.SkillLevelProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<logbook.client.managed.proxy.SkillLevelProxy>());

    @UiField
    TextBox german_text;

    @UiField
    SkillAcquiredSetEditor skillsAcquired;

    @UiField
    KeywordSetEditor keywords;

    public void setKeywordsPickerValues(Collection<logbook.client.managed.proxy.KeywordProxy> values) {
        keywords.setAcceptableValues(values);
    }

    public void setSkillsAcquiredPickerValues(Collection<logbook.client.managed.proxy.SkillAcquiredProxy> values) {
        skillsAcquired.setAcceptableValues(values);
    }

    public void setSkillLevelPickerValues(Collection<logbook.client.managed.proxy.SkillLevelProxy> values) {
        skillLevel.setAcceptableValues(values);
    }

    public void setTopicPickerValues(Collection<logbook.client.managed.proxy.TopicProxy> values) {
        topic.setAcceptableValues(values);
    }
}
