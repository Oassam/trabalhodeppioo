package Model;

//Em geral, essas habilidades enaltecem o aspecto heróico e santificado do Paladino. 
//Detecção do mal, imunidade a doenças, uma aura de coragem contagiante, e eventualmente, uma montaria especial concedida pela seu patrono divino. 
//Para se provar digno desses poderes, Paladinos geralmente seguem um forte código de conduta, que apesar das variações de acordo com a divindade, 
//sempre tem como base ajudar os fracos, promover o bem, manter a ordem e destruir o mal.
public class Paladino extends Antagonista {

    private static final int DANO = 15;
    private static final int RESISTENCIA = 12;
    private static final int CRITICO = 10;
    private static final int QTDE_ATAQUE_COMBO = 3;
    private static final int LIFE_START = 600;
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

    public Paladino(String nomePaladino) {
        setNome(nomePaladino);
        setQuantidadeVida(LIFE_START);
    }

}
