package Model;

public abstract class Personagem {
    
  String nome;
  Classe classe;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract int getDano();
  
  public abstract int getResistencia(); 
  
}
