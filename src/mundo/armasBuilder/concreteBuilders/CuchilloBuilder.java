package mundo.armasBuilder.concreteBuilders;

import mundo.armasBuilder.IBuilder;
import mundo.armasBuilder.productsBuilders.Cuchillo;

public class CuchilloBuilder implements IBuilder{

  private Cuchillo cuchillo;
  
  @Override
  public void setTiempoCarga(short tiempoCarga) {
    this.cuchillo.setTiempoCarga(tiempoCarga);
  }

  @Override
  public void setDanio(byte danio) {
    this.cuchillo.setDanio(danio);
  }

  @Override
  public void setEstado(String estado) {
    this.cuchillo.setEstado(estado);
  }

  @Override
  public void setLimBalas(byte limBalas) {}

  @Override
  public void settBombeo(short tBombeo) {}

  @Override
  public void setEnsangrentada(boolean ensangrentada) {}

  @Override
  public void setMunicion(byte municion) {}

  public Cuchillo getResult(){
    return this.cuchillo;
  }
  
}
