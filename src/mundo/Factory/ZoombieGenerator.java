package mundo.vivientesFactory;

public class ZoombieGenerator {
  private static Zombie zombie;
  static ZoombieGenerator instance;
  
  private ZoombieGenerator(){}

  public static ZoombieGenerator getInstance(){
    if(instance == null){
      instance = new ZoombieGenerator();
    }
    return instance;
  }

  public Zombie generate(String type, short level, Zombie lejano){
    if(type.equals("Caminante")){
      zombie = new Caminante(level, lejano);
    }else if(type.equals("Rastrero")){
      zombie = new Rastrero(level, lejano);
    }
    return zombie;
  }
}
