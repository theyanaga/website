package io.yanaga.views;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainLayout.class)
@CssImport("./styles/main-view.css")
public class AboutView extends Main {

    public AboutView() {
        addClassName("main-view");

        Paragraph p = new Paragraph("Meanwhile, follow me on ");
        p.add(new Anchor(MyLinks.TWITTER.getUrl(), "twitter!"));

        Section section = new Section(
                new H2("Hi, thank you for visiting my website!"),
                new Paragraph("This is where I will write some things about me!"),
                p);

        section.addClassName("section");


        add(section);
    }

}
