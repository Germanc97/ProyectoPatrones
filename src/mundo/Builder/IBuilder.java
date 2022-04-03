package mundo.armasBuilder;

import java.io.Serializable;

public interface IBuilder extends Serializable{
  void setTiempoCarga(short tiempoCarga);
  void setDanio(byte danio);
  void setEstado(String estado);
  void setLimBalas(byte limBalas);
  void settBombeo(short tBombeo);
  void setEnsangrentada(boolean ensangrentada);
  void setMunicion(byte municion);
}
