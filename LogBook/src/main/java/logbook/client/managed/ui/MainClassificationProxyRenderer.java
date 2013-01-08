package logbook.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import java.util.List;
import logbook.client.managed.proxy.ClassificationTopicProxy;
import logbook.client.managed.proxy.MainClassificationProxy;

public class MainClassificationProxyRenderer extends ProxyRenderer<MainClassificationProxy> {

    private static logbook.client.managed.ui.MainClassificationProxyRenderer INSTANCE;

    protected MainClassificationProxyRenderer() {
        super(new String[] { "description" });
    }

    public static logbook.client.managed.ui.MainClassificationProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new MainClassificationProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(MainClassificationProxy object) {
        if (object == null) {
            return "";
        }
        return object.getDescription() + " (" + object.getDescription() + ")";
    }
}
