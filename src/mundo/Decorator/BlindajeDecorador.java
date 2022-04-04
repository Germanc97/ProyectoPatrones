package mundo.Decorator;

import mundo.Factory.Enemigo;
import mundo.Factory.SerViviente;
import mundo.Factory.Zombie;

public class BlindajeDecorador extends CaminanteDecorador{

  private Zombie zombie;
  public BlindajeDecorador(SerViviente zombieDecorado) {
    super(zombieDecorado);
    //TODO Auto-generated constructor stub
  }


  public void agrearBlindaje(Zombie zombie){
    this.zombie= zombie;
    zombie.setEstadoActual("caminandoDecorado");
    System.out.println("Agregamos Decorator");
  }

  public Zombie getZombieBlindaje(){
    this.zombie.setEstadoActual("caminandoDecorado");
    this.zombie.setSalud((byte)100);
    System.out.println("Agregamos Decorator");
    return zombie;
  }


  @Override
  public String ataco() {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public int getPosX() {
    // TODO Auto-generated method stub
    return 0;
  }


  @Override
  public boolean recibeGranada() {
    // TODO Auto-generated method stub
    return false;
  }


  @Override
  public void terminaDeAtacar() {
    // TODO Auto-generated method stub
    
  }


  @Override
  public boolean comprobarDisparo(int x, int y, byte danio) {
    // TODO Auto-generated method stub
    return false;
  }
  
}
