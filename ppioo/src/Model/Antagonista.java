package Model;

public abstract class Antagonista extends Personagem{
  
  private static final int PODER_ATAQUE = 3;

  @Override
  public String atacar(Personagem personagemAtacado){
    String mensagemRetorno = personagemAtacado.reagir(this.getDano() * PODER_ATAQUE);
    return mensagemRetorno;
  }
}
