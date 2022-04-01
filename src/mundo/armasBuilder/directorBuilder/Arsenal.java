package mundo.armasBuilder.directorBuilder;

import mundo.armasBuilder.IBuilder;

public class Arsenal {

  public Arsenal() {
  }
  
  public void ConstructorCuchillo(IBuilder iBuilder){
    iBuilder.setTiempoCarga((short)200);
    iBuilder.setDanio((byte)4);
  }
  public void ConstructorGranada(IBuilder iBuilder){
    iBuilder.setMunicion((byte) 2);
    iBuilder.setTiempoCarga((short) 200);
    iBuilder.setDanio((byte)6);
  }
  public void ConstructorM1911(IBuilder iBuilder){
    iBuilder.settBombeo((short)100);
    iBuilder.setTiempoCarga((short)1300);
    iBuilder.setDanio((byte)1);
    iBuilder.setLimBalas((byte)8);
    iBuilder.setMunicion((byte)8);
  }
  public void ConstructorRemington(IBuilder iBuilder){
    iBuilder.settBombeo((short)400);
    iBuilder.setTiempoCarga((short)1400);
    iBuilder.setDanio((byte)3);
    iBuilder.setLimBalas((byte)3);
    iBuilder.setMunicion((byte)3);
  }

}
