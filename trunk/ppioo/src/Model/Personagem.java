package Model;

import static Model.Rotinas.DEFENDEU;
import static Model.Rotinas.SOFREU_DANO;

public abstract class Personagem {
    
  private String nomePersonagem;
  private int quantidadeVida;
  Classe classe;

  public abstract int getDano();
  
  public abstract int getResistencia(); 
  
  public abstract int atacar(Personagem personagemAtacado); 

  public String getNome() {
    return nomePersonagem;
  }

  public void setNome(String novoNome) {
    this.nomePersonagem = novoNome;
  }

  public int getQuantidadeVida() {
    return quantidadeVida;
  }

  public void setQuantidadeVida(int novaQuantidadeVida) {
    this.quantidadeVida = novaQuantidadeVida;
  }
  
  public void sofrerDano(int reducaoVida){
    this.quantidadeVida = this.quantidadeVida - reducaoVida;
  }
  
  public String reagir(int reducaoVida){
    String saida;
    boolean defesa = Rotinas.getRandomBoolean();
    sofrerDano(reducaoVida);
    saida = this.getNome() + SOFREU_DANO;
    
    if (defesa){
      this.setQuantidadeVida(this.getResistencia());
      saida = saida + DEFENDEU;
    }
    return saida;
  }
  
}
