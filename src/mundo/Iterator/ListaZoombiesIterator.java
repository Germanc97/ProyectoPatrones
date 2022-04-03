package mundo.Iterator;

import mundo.Factory.Zombie;

public class ListaZoombiesIterator implements Iterator{
  private int posicion = 0;
  private Zombie listaZombies[];

  public ListaZoombiesIterator(Zombie listaZombies[]) {
    this.listaZombies = listaZombies;
  }

  @Override
  public boolean hasNext() {    
    return this.posicion < this.listaZombies.length && this.listaZombies[posicion] != null;
  }

  @Override
  public Zombie next() {
    if(!this.hasNext()){
      return null;
    }
    return this.listaZombies[this.posicion++];
  }

}
