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
import logbook.client.managed.activity.SkillAcquiredEditActivityWrapper;
import logbook.client.managed.activity.SkillAcquiredEditActivityWrapper.View;
import logbook.client.managed.proxy.SkillAcquiredProxy;
import logbook.client.managed.proxy.SkillLevelProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.StudentProxy;
import logbook.client.scaffold.place.ProxyEditView;
import logbook.client.scaffold.ui.*;

public abstract class SkillAcquiredMobileEditView_Roo_Gwt extends Composite implements View<SkillAcquiredMobileEditView> {

    @UiField
    DateBox created;

    @UiField(provided = true)
    ValueListBox<SkillProxy> skill = new ValueListBox<SkillProxy>(logbook.client.managed.ui.SkillProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<logbook.client.managed.proxy.SkillProxy>());

    @UiField(provided = true)
    ValueListBox<StudentProxy> student = new ValueListBox<StudentProxy>(logbook.client.managed.ui.StudentProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<logbook.client.managed.proxy.StudentProxy>());

    @UiField(provided = true)
    ValueListBox<SkillLevelProxy> skillLevel = new ValueListBox<SkillLevelProxy>(logbook.client.managed.ui.SkillLevelProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<logbook.client.managed.proxy.SkillLevelProxy>());

    public void setStudentPickerValues(Collection<logbook.client.managed.proxy.StudentProxy> values) {
        student.setAcceptableValues(values);
    }

    public void setSkillPickerValues(Collection<logbook.client.managed.proxy.SkillProxy> values) {
        skill.setAcceptableValues(values);
    }

    public void setSkillLevelPickerValues(Collection<logbook.client.managed.proxy.SkillLevelProxy> values) {
        skillLevel.setAcceptableValues(values);
    }
}
