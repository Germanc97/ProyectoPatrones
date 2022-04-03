package mundo.Proxy;

import interfaz.PanelCamp;
import mundo.Factory.Personaje;

public interface IPersonaje {
  Personaje setHeadShots(Personaje personaje);
  void getHeadShots(Personaje personaje, PanelCamp panelCamp);
}
