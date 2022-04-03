package mundo.Iterator;

import mundo.Factory.Zombie;

public class CollecionZoombies implements Iterable{

  

  private Zombie zombies[];
  private int posicion;

  public CollecionZoombies() {
    this.zombies = new Zombie[16];
  }

  public void agregar(Zombie i){
    this.zombies[posicion++] = i;
  };
  
  @Override
  public Iterator createIterator() {
    return new ListaZoombiesIterator(zombies);
  }
  
}

