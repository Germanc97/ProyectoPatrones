package mundo.Builder.concreteBuilders;

import mundo.Builder.IBuilder;
import mundo.Builder.productsBuilders.Granada;

public class GranadaBuilder implements IBuilder{

  private Granada granada;

  public GranadaBuilder() {
    this.granada = new Granada();
  }
  
  @Override
  public void setTiempoCarga(short tiempoCarga) {
    this.granada.setTiempoCarga(tiempoCarga);
  }

  @Override
  public void setDanio(byte danio) {
    this.granada.setDanio(danio);
  }

  @Override
  public void setEstado(String estado) {
    this.granada.setEstado(estado);
  }

  @Override
  public void setLimBalas(byte limBalas) {}

  @Override
  public void settBombeo(short tBombeo) {}

  @Override
  public void setEnsangrentada(boolean ensangrentada) {}

  @Override
  public void setMunicion(byte municion) {
    this.granada.setMunicion(municion);
  }
  
  public Granada getResult(){
    return this.granada;
  }
}
