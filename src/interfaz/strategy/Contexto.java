package interfaz.Strategy;

import java.time.YearMonth;

import interfaz.InterfazZombieKiller;

public class Contexto {
  private IEstrategy strategy;

  public Contexto(IEstrategy strategy){
    this.strategy = strategy;
  }

  public void ejecutar(Boolean b, InterfazZombieKiller interfaz, int x, int y){
    this.strategy.executeAction(b, interfaz, x, y);
  }
}
