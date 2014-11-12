package Model;

//Essa classe é uma das especialistas em combates, tanto corpo-a-corpo quanto à distância, 
//e uma das mais versáteis. Com a quantidade de talentos que o guerreiro adiciona a sua lista, 
//ele pode se especializar nas mais diversas táticas de combate, 
//fazendo com que o guerreiro se adapte a situação com mais facilidade que muitas classes.
public class Guerreiro extends Antagonista{
    
    private static final int DANO = 10;
    private static final int RESISTENCIA = 8;

    @Override
    public int getDano() {
        return DANO;
    }

    @Override
    public int getResistencia() {
        return RESISTENCIA;
    }
    
}
