package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import javax.xml.transform.Result;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.index.render("Your new application is ready."));
    }

}
