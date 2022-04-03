package mundo.armasBuilder.concreteBuilders;

import mundo.armasBuilder.IBuilder;
import mundo.armasBuilder.productsBuilders.Remington;

public class RemingtonBuilder implements IBuilder{

  private Remington remington;

  public RemingtonBuilder() {
    this.remington = new Remington();
  }

  @Override
  public void setTiempoCarga(short tiempoCarga) {
    this.remington.setTiempoCarga(tiempoCarga);
  }

  @Override
  public void setDanio(byte danio) {
    this.remington.setDanio(danio);
  }

  @Override
  public void setEstado(String estado) {
    this.remington.setEstado(estado);
  }

  @Override
  public void setLimBalas(byte limBalas) {
    this.remington.setLimBalas(limBalas);
  }

  @Override
  public void settBombeo(short tBombeo) {
    this.remington.settBombeo(tBombeo);
  }

  @Override
  public void setEnsangrentada(boolean ensangrentada) {
    this.remington.setEnsangrentada(ensangrentada);
  }

  @Override
  public void setMunicion(byte municion) {
    this.remington.setMunicion(municion);
  }

  public Remington getResult(){
    return this.remington;
  }
  
}
