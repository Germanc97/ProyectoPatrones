package mundo.armasBuilder.concreteBuilders;

import mundo.armasBuilder.IBuilder;
import mundo.armasBuilder.productsBuilders.M1911;

public class M1911Builder implements IBuilder{

  private M1911 m1911;

  public M1911Builder() {
    this.m1911 = new M1911();
  }

  @Override
  public void setTiempoCarga(short tiempoCarga) {
    this.m1911.setTiempoCarga(tiempoCarga);
  }

  @Override
  public void setDanio(byte danio) {
    this.m1911.setDanio(danio);
  }

  @Override
  public void setEstado(String estado) {
    this.m1911.setEstado(estado);
  }

  @Override
  public void setLimBalas(byte limBalas) {
    this.m1911.setLimBalas(limBalas);
  }

  @Override
  public void settBombeo(short tBombeo) {
    this.m1911.settBombeo(tBombeo);
  }

  @Override
  public void setEnsangrentada(boolean ensangrentada) {
    this.m1911.setEnsangrentada(ensangrentada);
  }

  @Override
  public void setMunicion(byte municion) {
    this.m1911.setMunicion(municion);
  }
  
  public M1911 getResult(){
    return this.m1911;
  }
}
