package io.yanaga.views;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import io.yanaga.GreetService;

import javax.inject.Inject;

/**
 * The main view contains a button and a click listener.
 */
@PageTitle("HomePage")
@CssImport("./styles/main-view.css")
@Route(value = "", layout = MainLayout.class)
public class MainView extends Main {

    @Inject
    GreetService greetService;

    public MainView() {
        addClassName("main-view");

        String url = "twitter.com";

        Paragraph p = new Paragraph("Meanwhile, follow me on ");
        p.add(new Anchor(MyLinks.TWITTER.getUrl(), "twitter!"));

        Html html = new Html("<code>public class Potato </code>");


        Section section = new Section(
                new H2("Hi, thank you for visiting my website!"),
                new Paragraph("Something will be showing up here soon!"),
                p, html);

        section.addClassName("section");
        add(section);
    }
}
