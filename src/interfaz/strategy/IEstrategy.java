package interfaz.Strategy;

import interfaz.InterfazZombieKiller;

public interface IEstrategy {
  void executeAction(Boolean s, InterfazZombieKiller interfaz, int x, int y);
}
