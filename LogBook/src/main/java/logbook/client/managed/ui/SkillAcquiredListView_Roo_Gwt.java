// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;
import logbook.client.managed.proxy.SkillAcquiredProxy;
import logbook.client.managed.proxy.SkillLevelProxy;
import logbook.client.managed.proxy.SkillProxy;
import logbook.client.managed.proxy.StudentProxy;
import logbook.client.scaffold.place.AbstractProxyListView;

public abstract class SkillAcquiredListView_Roo_Gwt extends AbstractProxyListView<SkillAcquiredProxy> {

    @UiField
    CellTable<SkillAcquiredProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("created");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getCreated());
            }
        }, "Created");
        paths.add("skill");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<logbook.client.managed.proxy.SkillProxy> renderer = logbook.client.managed.ui.SkillProxyRenderer.instance();

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getSkill());
            }
        }, "Skill");
        paths.add("student");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<logbook.client.managed.proxy.StudentProxy> renderer = logbook.client.managed.ui.StudentProxyRenderer.instance();

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getStudent());
            }
        }, "Student");
        paths.add("skillLevel");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<logbook.client.managed.proxy.SkillLevelProxy> renderer = logbook.client.managed.ui.SkillLevelProxyRenderer.instance();

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getSkillLevel());
            }
        }, "Skill Level");
        paths.add("version");
        table.addColumn(new TextColumn<SkillAcquiredProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(SkillAcquiredProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
