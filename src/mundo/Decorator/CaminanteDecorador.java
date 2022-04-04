package mundo.Decorator;

import mundo.Factory.Enemigo;
import mundo.Factory.SerViviente;

public abstract class CaminanteDecorador extends Enemigo{
  protected SerViviente zombieDecorado;

  public CaminanteDecorador(SerViviente zombieDecorado){
    this.zombieDecorado = zombieDecorado;
  }
  public void agrearBlindaje(){}
}
