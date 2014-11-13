package Model;

public abstract class Protagonista extends Personagem {

    public abstract int calcularFatorIncremento();

    public void incrementarVida(Personagem personagem, int fatorIncremento) {
        personagem.setQuantidadeVida(personagem.getQuantidadeVida() + fatorIncremento);
    }

}
