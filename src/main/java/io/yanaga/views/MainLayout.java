package io.yanaga.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/main-layout.css")
public class MainLayout extends AppLayout {

    public MainLayout() {
        addClassName("main-layout");

        H1 title = new H1("Yanaga");
        title.addClassName("title");

        Tab home = new Tab(new Anchor("", "Home"));
        Tab posts = new Tab(new Anchor("posts", "Posts"));
        Tab about = new Tab(new Anchor("about", "About"));

        Tabs tabs = new Tabs(home, posts, about);
        tabs.addClassName("tabs");


        HorizontalLayout header = new HorizontalLayout(title);
        header.addClassName("header");
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(tabs);

        addToNavbar(header, tabs);
    }

}
