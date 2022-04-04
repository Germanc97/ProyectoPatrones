package interfaz.Memento;

import mundo.Singleton.SurvivorCamp;

public class Memento {
  private SurvivorCamp estado;

  public Memento(SurvivorCamp estado){
    this.estado = estado;
  }

  public SurvivorCamp getEstado(){
    return estado;
  }
}
