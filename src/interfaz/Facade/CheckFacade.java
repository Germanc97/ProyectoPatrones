package interfaz.Facade;

import hilo.HiloArma;
import hilo.HiloBoss;
import hilo.HiloEnemigo;
import hilo.HiloGeneradorDeZombies;
import hilo.HiloSonido;
import interfaz.InterfazZombieKiller;
import mundo.Builder.ArmaDeFuego;
import mundo.Factory.Boss;
import mundo.Singleton.SurvivorCamp;


public class CheckFacade {
  private HiloArma hiloArma;
  private HiloBoss hiloBoss;
  private HiloEnemigo hiloEnemigo;
  private HiloSonido hiloSonido;
  private HiloGeneradorDeZombies hiloGeneradorDeZombies;
  private String action;

  public CheckFacade(InterfazZombieKiller interfaz, SurvivorCamp campo, String action){
    this.action = action;
    if (this.action.contains("partidaIniciada") || this.action.contains("cargarJuego")){
      hiloGeneradorDeZombies = new HiloGeneradorDeZombies(interfaz, campo);
      hiloEnemigo = new HiloEnemigo(interfaz, campo.getZombNodoCercano(), campo);
    } else if(this.action.contains("granadaLanzada")){
      hiloArma = new HiloArma(interfaz, campo.getPersonaje().getGranadas());
    } else if(this.action.contains("acuchillar")){
      hiloArma = new HiloArma(interfaz, campo.getPersonaje().getCuchillo());
    }
  }
  public CheckFacade(InterfazZombieKiller interfaz, Boss boss, SurvivorCamp campo, String action){
    this.action = action;
    if(this.action.contains("generarBoss")){
      hiloBoss = new HiloBoss(interfaz, boss, campo);
    }
  }
  public CheckFacade(String sonido, String action){
    this.action = action;
    if (this.action.contains("iniciarGemi2") || this.action.contains("reproducir")){
      hiloSonido = new HiloSonido(sonido);
    }
  }
  public CheckFacade(InterfazZombieKiller interfaz, ArmaDeFuego arma, String action){
    this.action = action;
    if (this.action.contains("disparar") || this.action.contains("cargarArmaPersonaje")){
      hiloArma = new HiloArma(interfaz, arma);
    }
  }

  //**** START FACADE ****

  public void start(){
    if (this.action.contains("partidaIniciada") || this.action.contains("cargarJuego")){
      hiloGeneradorDeZombies.start();
      hiloEnemigo.start();
    }
    else if (this.action.contains("disparar") 
      || this.action.contains("granadaLanzada") 
      || this.action.contains("cargarArmaPersonaje") 
      || this.action.contains("acuchillar")){
      hiloArma.start();
    }
    else if (this.action.contains("iniciarGemi2") || this.action.contains("reproducir")){
      hiloSonido.start();
    }else if(this.action.contains("generarBoss")){
      hiloBoss.start();;
    }
  }
}
