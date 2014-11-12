package Model;

import java.util.Random;

public class Rotinas {
  
  public static final String SOFREU_DANO = "sofreu dano";
  public static final String DEFENDEU = " porém se defendeu";
  
  public static boolean getRandomBoolean(){
    Random novoBoolean = new Random();
    return novoBoolean.nextBoolean();
  }
}
