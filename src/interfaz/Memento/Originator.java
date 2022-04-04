package interfaz.Memento;

import mundo.Singleton.SurvivorCamp;

public class Originator {
  private SurvivorCamp estado;

  public void setEstado(SurvivorCamp estado){
    this.estado = estado;
  }

  public SurvivorCamp getEstado(){
    return this.estado;
  }

  public Memento guardar(){
    return new Memento(estado);
  }

  public void restaurar(Memento m){
    this.estado = m.getEstado();
  }

}
