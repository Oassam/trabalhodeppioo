package Model;

import static Control.Rotinas.getRandomInteger;

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

    public Mago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularFatorIncremento() {
        int fatorIncremento = (getQuantidadeVida() / 2);
        return fatorIncremento - getRandomInteger(getQuantidadeVida() / 2);
    }

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

    public Mago(String nomeMago) {
        setNome(nomeMago);
        setQuantidadeVida(LIFE_START);
    }

  @Override
  public String informacaoPersonagem() {
      String lineBreak = System.lineSeparator();
      String informacao = "";
      informacao = informacao + "Tipo..............: Mago" + lineBreak;
      informacao = informacao + "Vida inicial..: " + Integer.toString(LIFE_START) + lineBreak;
      informacao = informacao + "Resistencia: " + Integer.toString(RESISTENCIA) + lineBreak;
      informacao = informacao + "Dano.............: " + Integer.toString(DANO) + lineBreak;
      return informacao;
    }

}
