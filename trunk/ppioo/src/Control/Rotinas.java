package Control;

import java.util.Random;
import javax.swing.JOptionPane;

public class Rotinas {

    public static final String SOFREU_DANO = "sofreu dano";
    public static final String DEFENDEU = " porém se defendeu";

    public static boolean getRandomBoolean() {
        Random novoBoolean = new Random();
        return novoBoolean.nextBoolean();
    }

    public static int getRandomInteger(int maximo, int minimo) {
        Random novoInteiro = new Random();
        int resultado = novoInteiro.nextInt(maximo);
        
        if (resultado == 0) {
            return resultado + minimo;
        } return resultado;
    }    

    public static int getRandomInteger(int maximo) {
        Random novoInteiro = new Random();
            return novoInteiro.nextInt(maximo);
    }
    
    public static boolean pergunta(String mensagemPergunta){
      int resultado = JOptionPane.YES_OPTION;
      JOptionPane.showConfirmDialog(null, mensagemPergunta, "", resultado);
      return (resultado == JOptionPane.YES_OPTION);
    }
}
