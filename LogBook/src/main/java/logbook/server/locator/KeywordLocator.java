package logbook.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import logbook.server.domain.Keyword;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("logbook.server.domain.Keyword")
@Component
public class KeywordLocator extends Locator<Keyword, Long> {

    public Keyword create(Class<? extends logbook.server.domain.Keyword> clazz) {
        return new Keyword();
    }

    public Keyword find(Class<? extends logbook.server.domain.Keyword> clazz, Long id) {
        return Keyword.findKeyword(id);
    }

    public Class<logbook.server.domain.Keyword> getDomainType() {
        return Keyword.class;
    }

    public Long getId(Keyword keyword) {
        return keyword.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Keyword keyword) {
        return keyword.getVersion();
    }
}
