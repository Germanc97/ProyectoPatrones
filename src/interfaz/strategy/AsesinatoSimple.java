package interfaz.Strategy;

import interfaz.InterfazZombieKiller;

public abstract class AsesinatoSimple implements IEstrategy{
  public void matar(boolean bool, InterfazZombieKiller interfaz, int x, int y){
    if(bool){
      disparar(interfaz, x, y);
    }else{
      acuchillar(interfaz, x, y);
    }
  }
  abstract void disparar(InterfazZombieKiller interfaz, int x, int y);
  abstract void acuchillar(InterfazZombieKiller interfaz, int x, int y);
}
