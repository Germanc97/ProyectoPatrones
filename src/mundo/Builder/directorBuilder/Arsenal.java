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
    iBuilder.setDanio((byte)50);
    iBuilder.setLimBalas((byte)100);
    iBuilder.setMunicion((byte)100);
  }
  public void ConstructorRemington(IBuilder iBuilder){
    iBuilder.settBombeo((short)800);
    iBuilder.setTiempoCarga((short)400);
    iBuilder.setDanio((byte)10);
    iBuilder.setLimBalas((byte)20);
    iBuilder.setMunicion((byte)20);
  }

}
