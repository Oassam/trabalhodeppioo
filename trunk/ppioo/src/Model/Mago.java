package Model;

//Magos são pesquisadores das artes arcanas da Idade Média. 
//Muitas vezes, em jogos e filmes, aparecem como vilões principais e como herói coadjuvante. 
//Talvez seja certo, classificar alquimistas como uma subclasse de mago.
public class Mago extends Protagonista{
    
    private static final int DANO = 20;
    private static final int RESISTENCIA = 20;
    
    @Override
    public int calcularFatorIncremento() {
        return (Mago.super.getQuantidadeVida()/2);
    }

    @Override
    public int getDano() {
        return DANO;
    }

    @Override
    public int getResistencia() {
        return RESISTENCIA;
    }
    
}
