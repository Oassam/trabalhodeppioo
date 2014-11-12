package Model;

public class Antagonista extends Personagem{

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
