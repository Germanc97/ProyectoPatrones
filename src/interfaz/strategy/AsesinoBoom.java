package interfaz.Strategy;

import interfaz.InterfazZombieKiller;

public class AsesinoBoom extends AsesinatoExplosivo{

  @Override
  public void executeAction(Boolean bool, InterfazZombieKiller interfaz, int x, int y) {
    explotar(interfaz);     
  }

  @Override
  void explotar(InterfazZombieKiller interfaz) {
    interfaz.granadaLanzada();
  }  
}
