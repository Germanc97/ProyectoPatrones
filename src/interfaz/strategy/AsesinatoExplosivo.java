package interfaz.strategy;

import interfaz.InterfazZombieKiller;

public abstract class AsesinatoExplosivo implements IEstrategy {
  public void matar(InterfazZombieKiller interfaz){
    explotar(interfaz);
  }
  abstract void explotar(InterfazZombieKiller interfaz);
}
