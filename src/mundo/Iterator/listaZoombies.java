package mundo.iterator;

import mundo.vivientesFactory.Zombie;

public class listaZoombies implements Iterable{

  private Zombie listaZombies[];
  private int posicion;

  public listaZoombies() {
    listaZombies = new Zombie[16];
    posicion = 0;
  }

  public void agregar(Zombie i){
    listaZombies[posicion++] = i;
  };
  
  @Override
  public Iterator createIterator() {
    return new ListaZoombiesIterator(listaZombies);
  }
  
}

