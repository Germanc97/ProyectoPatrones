package mundo.Proxy;

import interfaz.PanelCamp;
import mundo.Factory.Personaje;

public class PersonajeProxy implements IPersonaje {

  private PersonajeImpl personajeReal;
  @Override
  public Personaje setHeadShots(Personaje personaje) {
    if(personajeReal == null){
      personajeReal = new PersonajeImpl();
      return personajeReal.setHeadShots(personaje);
    }else {
      return personajeReal.setHeadShots(personaje);
    }
  }

  @Override
  public void getHeadShots(Personaje personaje, PanelCamp panelCamp) {
    if(personajeReal == null){
      personajeReal = new PersonajeImpl();
      personajeReal.getHeadShots(personaje, panelCamp);
    }else {
      personajeReal.getHeadShots(personaje, panelCamp);
    }
  }
}
