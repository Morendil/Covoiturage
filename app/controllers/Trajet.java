package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Trajet extends Controller {
  
  public static Result index() {
    return ok("Aucun.");
  }

  public static Result save() {
    return badRequest("KO.");
  } 
}
