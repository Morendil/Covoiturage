package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Trajet extends Model {

  @Id
  public Long id;

  @Required
  public String depart;
  @Required
  public String arrivee;
  @Required
  public Date date;

  public static Finder<Long,Trajet> find = new Finder(
    Long.class, Trajet.class
  );

  public static List<Trajet> all() {
    return find.all();
  }

  public static void create(Trajet trajet) {
    trajet.save();
  }
}
