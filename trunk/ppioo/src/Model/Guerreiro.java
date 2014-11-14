package Model;

//Essa classe é uma das especialistas em combates, tanto corpo-a-corpo quanto à distância, 
//e uma das mais versáteis. Com a quantidade de talentos que o guerreiro adiciona a sua lista, 
//ele pode se especializar nas mais diversas táticas de combate, 
//fazendo com que o guerreiro se adapte a situação com mais facilidade que muitas classes.
public class Guerreiro extends Antagonista {

    private static final int DANO = 30;
    private static final int RESISTENCIA = 50;
    private static final int CRITICO = 10;
    private static final int QTDE_ATAQUE_COMBO = 3;
    private static final int LIFE_START = 500;
    private int contador = 0;

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
            mensagemSaida = personagemAtacado.reagir(this.getDano() * PODER_ATAQUE);
            contador++;
        } else {
            mensagemSaida = personagemAtacado.reagir(this.getDano() * CRITICO);
            contador = 0;
        }
        return mensagemSaida;
    }

    public Guerreiro(String nomeGuerreiro) {
        setNome(nomeGuerreiro);
        setQuantidadeVida(LIFE_START);
    }

}
