package interfaz.strategy;

import interfaz.InterfazZombieKiller;

public class Asesino extends AsesinatoSimple{

  @Override
  void disparar(InterfazZombieKiller interfaz, int x, int y) {
    interfaz.disparar(x, y);
  }

  @Override
  void acuchillar(InterfazZombieKiller interfaz, int x, int y) {
    interfaz.acuchillar(x, y);
  }

  @Override
  public void executeAction(Boolean bool, InterfazZombieKiller interfaz, int x, int y) {
    if(bool){
      disparar(interfaz, x , y);
    }else{
      acuchillar(interfaz, x, y);
    }    
  }  
}
