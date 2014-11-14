package Control;

import Model.Equipe;
import Model.Guerreiro;
import Model.Mago;
import Model.Paladino;
import Model.Personagem;
import Model.Protagonista;
import javax.swing.JOptionPane;

public class Acoes {
    
  public static final int ID_MAGO = 1;
  public static final int ID_PALADINO = 2;
  public static final int ID_GUERREIRO = 3;

    public Equipe equipeJogador;
    public Equipe equipeCPU;

    public Equipe selecionarPersonagem(int personagemSelecionado) {
        String nomePersonagem = JOptionPane.showInputDialog(null, "Digite o nome do personagem", "", JOptionPane.PLAIN_MESSAGE);
        Personagem novoPersonagem; 
        switch (personagemSelecionado) {
            case ID_MAGO:
                novoPersonagem = new Mago(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipe(novoPersonagem);
                break;

            case ID_PALADINO:
                novoPersonagem = new Paladino(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipe(novoPersonagem);
                break;

            case ID_GUERREIRO:
                novoPersonagem = new Guerreiro(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipe(novoPersonagem);
                break;
              
            default:
                break;
        }
        return equipeJogador;
    }

    public void iniciaJogo() {
        equipeCPU = new Equipe();
        equipeJogador = new Equipe();
    }
    
    public boolean jogoTerminado(Equipe equipe){
        return (equipe.getPersonagem(0) == null);
    }
    
    public void atualizaEquipe(Equipe equipe){
        for (Personagem personagem: equipe.getListaEquipe()){
            if (personagem.getQuantidadeVida() < 1){
                equipe.removePersonagemEquipe(personagem);
            }
        }
    }
    
    public void atacarAdversario(Personagem agressor, Personagem atacado){
        if (atacado.getQuantidadeVida() > 0) {
            JOptionPane.showMessageDialog(null, agressor.atacar(atacado));
        }else{
            throw new IndexOutOfBoundsException("Personagem atacado já está morto."); 
        }
    }
    
    public void regeneraAliado(Protagonista curador, Personagem regenerado){
        curador.incrementarVida(regenerado, curador.calcularFatorIncremento());
    }
    
    public void iniciaEquipeCPU(){        
        for (Personagem novoPersonagemCPU: equipeJogador.getListaEquipe()){
            novoPersonagemCPU.setNome("Adversario");
            equipeCPU.adicionaPersonagemEquipe(novoPersonagemCPU);
        }
    }

}
