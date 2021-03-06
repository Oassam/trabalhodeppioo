package Model;

//Em geral, essas habilidades enaltecem o aspecto heróico e santificado do Paladino. 
//Detecção do mal, imunidade a doenças, uma aura de coragem contagiante, e eventualmente, uma montaria especial concedida pela seu patrono divino. 
//Para se provar digno desses poderes, Paladinos geralmente seguem um forte código de conduta, que apesar das variações de acordo com a divindade, 
//sempre tem como base ajudar os fracos, promover o bem, manter a ordem e destruir o mal.
public class Paladino extends Antagonista {

    private static final int DANO = 15;
    private static final int RESISTENCIA = 12;
    private static final int CRITICO = 10;

    public static int getDANO() {
        return DANO;
    }

    public static int getRESISTENCIA() {
        return RESISTENCIA;
    }

    public static int getCRITICO() {
        return CRITICO;
    }

    public static int getQTDE_ATAQUE_COMBO() {
        return QTDE_ATAQUE_COMBO;
    }

    public static int getLIFE_START() {
        return LIFE_START;
    }

    public static int getPODER_ATAQUE() {
        return PODER_ATAQUE;
    }
    private static final int QTDE_ATAQUE_COMBO = 3;
    private static final int LIFE_START = 600;
    private int contador = 0;

    public Paladino() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Paladino(String nomePaladino) {
        setNome(nomePaladino);
        setQuantidadeVida(LIFE_START);
    }
    
    @Override
    public String informacaoPersonagem(){
      String lineBreak = System.lineSeparator();
      String informacao = "";
      informacao = informacao + "Tipo.........: Paladino" + lineBreak;
      informacao = informacao + "Vida inicial.: " + Integer.toString(LIFE_START) + lineBreak;
      informacao = informacao + "Resistencia..: " + Integer.toString(RESISTENCIA) + lineBreak;
      informacao = informacao + "Dano.........: " + Integer.toString(DANO) + lineBreak;
      return informacao;
    }

}
