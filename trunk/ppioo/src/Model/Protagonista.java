package Model;

public class Protagonista extends Personagem{

  @Override
  public int getDano() {
    return 0;
  }

  @Override
  public int getResistencia() {
    return 0;
  }

  @Override
  public int atacar(Personagem personagemAtacado) {
    return 0;
  }
  
}
