package logbook.client.scaffold.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle {
  private static MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void createButtonInitializer() {
    createButton = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "createButton",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 19, 19, false, false
    );
  }
  private static class createButtonInitializer {
    static {
      _instance0.createButtonInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return createButton;
    }
  }
  public com.google.gwt.resources.client.ImageResource createButton() {
    return createButtonInitializer.get();
  }
  private void styleInitializer() {
    style = new logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GAK-4ALBGM{height:" + ((MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getSafeUri().asString() + "\") -" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getLeft() + "px -" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:" + ("0")  + ";margin:" + ("9px"+ " " +"9px"+ " " +"9px"+ " " +"0")  + ";width:" + ("12em")  + ";font-size:" + ("12pt")  + ";cursor:" + ("pointer")  + ";text-align:" + ("right")  + ";padding-right:") + (("22px")  + ";color:" + ("#6a779a")  + ";}.GAK-4ALBHM{border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}")) : ((".GAK-4ALBGM{height:" + ((MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getSafeUri().asString() + "\") -" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getLeft() + "px -" + (MobileProxyListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:" + ("0")  + ";margin:" + ("9px"+ " " +"0"+ " " +"9px"+ " " +"9px")  + ";width:" + ("12em")  + ";font-size:" + ("12pt")  + ";cursor:" + ("pointer")  + ";text-align:" + ("left")  + ";padding-left:") + (("22px")  + ";color:" + ("#6a779a")  + ";}.GAK-4ALBHM{border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}"));
      }
      public java.lang.String createButton(){
        return "GAK-4ALBGM";
      }
      public java.lang.String list(){
        return "GAK-4ALBHM";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAADDElEQVR42nVUW0gUURgeu9/vUdEFfJDIgkAhW3Z3dlIrBX2RRtCdmwZCyUb7Ui/lPlQvuu3atrNzxl3rQX1oHyQEs4JQibTUqKTriwhlUFBgWaQPTfOdbdZZtw78nDn/+b5v/v/85z8MYx+BwKLCBn2paas4JbyhpCa+jfNGdjlFfQ9mujb92AcOeOZfg+eTiznl5gpXbWwjW6fu5kTtgEciDlbUij0COUpncw0/9oEDHjxmYUTY4Gr0LU4htpeVo2zZqRvCxfiInrg3OZzomxzFjDX82AcOePBsERo55b7Icmy4vSTfI8XKm+KjibsvZmYG384ZAwsM/qb4kwRwwIMHPnQYjgssKeX19axC8tyidjyUfNVjEQffzRldvWOGIsvG5SCxic4aYRMHPFtL8sCHDgNVt6DvwHn4QwPN/W9+/QbYInb1PjVkScoQw0+A87cONIMHPo2O49U1iMojksruka9T1p/tYojsSlDPSBeC3Y+/THlEtRLRQYdBVVwCOSheuO23Ay3RTjNNGWm2EOq3GzDggQ8dhh68pB06rz5qtcQafWepAAxRIU1qf32wnqH3FAse+NBh3HWRrS4xWhRoH2uz/tZ4xp8WUmyi1jeEe4Y/0MjBAx86TIkU3ewWogW+YP+l+RRn02nSAtBq6lkpwsAzC1AAHabIG1nHiuq+I/Vt1XeefZvOFEtdDVrNFpJ15/qef58uVnQefOgwDj60Er3nEjQuTO/YfFSpyFIFWFhN2NVbL7s5k4f2gg6DhnWcTGxCz3F15ERy6NOElS4sXc0gyUgxOfR5AninHN0PPm189BVUcfFccqywwtchdTyYGrffdkvAOgLsV5zukIAHj0Zl9SdaAZeuWNJ2ohi4iOeiD6919n98fX/8x0+IYMYafpe5j0N3mHjwaCvNDyMHjmNiy2q8WfRF8MYOcwopMw+3ihW0alYkVZyglsGPfeCATwmZTZ45jBzrTSttMBtXUbezYjyXPklmtVLz9Vz4aWOn37IsoWzRfD65DGeBNJz17WsxYw3//0T+AKQE12Y6YgSsAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource createButton;
  private static logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      createButton(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("createButton", createButton());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'createButton': return this.@logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle::createButton()();
      case 'style': return this.@logbook.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
