package Model;

import static Model.Rotinas.getRandomInteger;

//Magos são pesquisadores das artes arcanas da Idade Média. 
//Muitas vezes, em jogos e filmes, aparecem como vilões principais e como herói coadjuvante. 
//Talvez seja certo, classificar alquimistas como uma subclasse de mago.
public class Mago extends Protagonista {

    private static final int DANO = 40;
    private static final int RESISTENCIA = 60;
    private static final int CRITICO = 100;
    private static final int QTDE_ATAQUE_COMBO = 5;
    private static final int LIFE_START = 800;
    private int contador = 0;

    @Override
    public int calcularFatorIncremento() {
        int fatorIncremento = (getQuantidadeVida() / 2);
        return fatorIncremento - getRandomInteger(getQuantidadeVida() / 2);
    }

    @Override
    public int getDano() {
        return DANO;
    }

    @Override
    public int getResistencia() {
        return RESISTENCIA;
    }

    @Override
    public String atacar(Personagem personagemAtacado) {
        String mensagemSaida;
        if (contador < QTDE_ATAQUE_COMBO) {
            mensagemSaida = personagemAtacado.reagir(this.getDano());
            contador++;
        } else {
            mensagemSaida = personagemAtacado.reagir(this.getDano() * CRITICO);
            contador = 0;
        }
        return mensagemSaida;
    }

    public void novoMago(String nomeMago) {
        setNome(nomeMago);
        setQuantidadeVida(LIFE_START);
    }

}
