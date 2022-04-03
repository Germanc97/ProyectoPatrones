package mundo.Proxy;

import interfaz.PanelCamp;
import mundo.Factory.Personaje;

public class PersonajeImpl implements IPersonaje{

  @Override
  public Personaje setHeadShots(Personaje personaje) {
    personaje.aumentarTirosALaCabeza();
    return personaje;
  }

  @Override
  public void getHeadShots(Personaje personaje, PanelCamp panelCamp) {
    panelCamp.setHeadShotsLabel(personaje);
  }
  
}
