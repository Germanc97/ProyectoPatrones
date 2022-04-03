package hilo;

import interfaz.InterfazZombieKiller;
import mundo.Factory.Zombie;
import mundo.Iterator.Iterator;
import mundo.Iterator.CollecionZoombies;
import mundo.Singleton.SurvivorCamp;

public class HiloGeneradorDeZombies extends Thread {

	private InterfazZombieKiller principal;
	private SurvivorCamp campo;
  private CollecionZoombies listaZombies;
  private Iterator iterator;

	public HiloGeneradorDeZombies(InterfazZombieKiller principal, SurvivorCamp campo) {
		this.principal = principal;
		this.campo = campo;
	}

	@Override
	public void run() {
		try {
			while (principal.estaCargando())
				sleep(1000);
			principal.cambiarPuntero();
			// *** Este número solo es para validación
      int contadorZombiesPorNivel = campo.getCantidadZombiesGenerados();
      // ***** ***** ***** ***** ***** ***** *****
			int nivel = campo.getRondaActual();

      
      
      listaZombies = new CollecionZoombies();
      for(int i = 0; i<SurvivorCamp.NUMERO_ZOMBIES_RONDA; i++){
        listaZombies.agregar(principal.getZoombie(nivel));
      }
      iterator = listaZombies.createIterator();

			while (campo.getEstadoJuego() != SurvivorCamp.SIN_PARTIDA) {
//				 System.out.println(contadorZombiesPorNivel);
        
				if (contadorZombiesPorNivel % SurvivorCamp.NUMERO_ZOMBIES_RONDA == 0) {
					while (!campo.getZombNodoLejano().getAlFrente().getEstadoActual().equals(Zombie.NODO) && campo.getPersonaje().getSalud() > 0) {
						sleep(1000);
					}
					if (campo.getEstadoJuego() != SurvivorCamp.SIN_PARTIDA) {
						while (campo.getEstadoJuego() == SurvivorCamp.PAUSADO)
							sleep(500);
						nivel++;

            listaZombies = new CollecionZoombies();
            for(int i = 0; i<SurvivorCamp.NUMERO_ZOMBIES_RONDA; i++){
              listaZombies.agregar(principal.getZoombie(nivel));
            }
            iterator = listaZombies.createIterator();

						principal.subirDeRonda(nivel);
						sleep(2000);
						principal.iniciarGemi2();
						campo.setEstadoJuego(SurvivorCamp.EN_CURSO);
					}
				}

				if (nivel < 10 && campo.getEstadoJuego() != SurvivorCamp.SIN_PARTIDA) {
//					System.out.println("llama al metodo de generar zombie desde el hilo generador");
					if(!campo.getZombNodoLejano().getAlFrente().getEstadoActual().equals(Zombie.MURIENDO_INCENDIADO))
					
          // ***** AQUI PUEDO APLICARLO ******
          //
          principal.introducirZoombi((Zombie) iterator.next());
          
          //principal.generarZombie(nivel);
					contadorZombiesPorNivel++;
					// ******* ******* *******

          sleep(1400);
				} else if (nivel == 10) {
					principal.generarBoss();
					while (campo.getEstadoJuego() != SurvivorCamp.SIN_PARTIDA)
						sleep(500);
				}
				while (campo.getEstadoJuego() == SurvivorCamp.PAUSADO) {
					sleep(500);
				}
			}
			if (campo.getPersonaje().getSalud() <= 0) {
				principal.reproducir("meMuero");
				principal.juegoTerminado();
			} else if (campo.getJefe() != null && campo.getJefe().getSalud() <= 0)
				principal.victoria();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
