package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.trajet.*;

import models.*;

public class TrajetActions extends Controller {
 
  static Form<Trajet> trajetForm  = form(Trajet.class);
 
  public static Result index() {
    return ok(index.render(Trajet.all()));
  }

  public static Result create() {
    return ok(form.render(trajetForm));
  }

  public static Result save() {
    Form<Trajet> filledForm = trajetForm.bindFromRequest();
    if(filledForm.hasErrors()) {
      return badRequest(form.render(filledForm));
    } else {
      Trajet.create(filledForm.get());
      return redirect(routes.TrajetActions.index());  
    }
  } 
}
