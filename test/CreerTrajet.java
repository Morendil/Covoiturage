package test;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import java.util.*;

import models.Trajet;

public class CreerTrajet {

  @Test
  public void creerUnTrajet() {
    running(fakeApplication(), new Runnable() {
      public void run() {
        assertThat(Trajet.all()).isEmpty();

        Map<String,String> data = new HashMap<String,String>();
        data.put("depart","Paris");
        data.put("arrivee","Lille");
        data.put("date","31/01/2013");

        Result result = callAction(
          controllers.routes.ref.Trajet.save(),
          fakeRequest().withFormUrlEncodedBody(data)
        );

        assertThat(status(result)).isEqualTo(SEE_OTHER);
        assertThat(redirectLocation(result)).isEqualTo("/trajets");
        assertThat(Trajet.all()).hasSize(1);
      }
    });
  }
}
