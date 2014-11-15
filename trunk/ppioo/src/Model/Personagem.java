package Model;

import Control.Rotinas;
import static Control.Rotinas.DEFENDEU;
import static Control.Rotinas.SOFREU_DANO;

public abstract class Personagem {

    private String nomePersonagem;
    private int quantidadeVida;

    public abstract int getDano();

    public abstract int getResistencia();

    public abstract String atacar(Personagem personagemAtacado);
    
    public abstract String informacaoPersonagem();

    public String getNome() {
        return nomePersonagem;
    }

    public void setNome(String novoNome) {
        this.nomePersonagem = novoNome;
    }

    public int getQuantidadeVida() {
        return quantidadeVida;
    }

    public void setQuantidadeVida(int novaQuantidadeVida) {
        this.quantidadeVida = novaQuantidadeVida;
    }

    public void sofrerDano(int reducaoVida) {
        this.quantidadeVida = this.quantidadeVida - reducaoVida;
    }

    public String reagir(int reducaoVida) {
        String mensagemRetorno;
        boolean defende = Rotinas.getRandomBoolean();
        sofrerDano(reducaoVida);
        mensagemRetorno = this.getNome() + SOFREU_DANO;

        if (defende) {
            this.setQuantidadeVida(this.getResistencia());
            mensagemRetorno = mensagemRetorno + DEFENDEU;
        }
        return mensagemRetorno;
    }

}
