package Control;

import Model.Equipe;
import Model.Guerreiro;
import Model.Mago;
import Model.Paladino;
import Model.Personagem;
import Model.Protagonista;
import View.TelaCombate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Acoes {

    public static final int ID_MAGO = 0;
    public static final int ID_PALADINO = 1;
    public static final int ID_GUERREIRO = 2;

    private static Equipe equipeJogador;
    private static Equipe equipeCPU;

    public static Equipe selecionarPersonagem(int idPersonagem, String nomePersonagem) {
        Personagem novoPersonagem;
        switch (idPersonagem) {
            case ID_MAGO:
                novoPersonagem = new Mago(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipeJogador(novoPersonagem);
                break;

            case ID_PALADINO:
                novoPersonagem = new Paladino(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipeJogador(novoPersonagem);
                break;

            case ID_GUERREIRO:
                novoPersonagem = new Guerreiro(nomePersonagem);
                equipeJogador.adicionaPersonagemEquipeJogador(novoPersonagem);
                break;

            default:
                break;
        }
        return equipeJogador;
    }

    public static void iniciaJogo(String nomeEquipe) {
        equipeCPU = new Equipe();
        equipeCPU.EquipeCPU();
        equipeCPU.setNomeCPU("Adversário");
        equipeJogador = new Equipe();
        equipeJogador.EquipeJogador();
        equipeJogador.setNomeJogador(nomeEquipe);
    }

    public static int getIdByPersonagemName(String nome) {
        switch (nome) {
            case "Mago":
                return ID_MAGO;
            case "Guerreiro":
                return ID_GUERREIRO;
            default:
                return ID_PALADINO;
        }
    }

    public static Equipe getEquipeJogador() {
        return equipeJogador;
    }

    public static Equipe getEquipeCPU() {
        return equipeCPU;
    }

    public boolean jogoTerminado() {
        return (equipeCPU.getPersonagemCPU(0) == null) || (equipeJogador.getPersonagemJogador(0) == null);
    }

    public static void atualizaEquipe() {
        int controle = Acoes.getEquipeJogador().getListaEquipeJogador().size();
        for (int i = 0; i < controle; i++) {
            if (Acoes.getEquipeJogador().getPersonagemJogador(i).getQuantidadeVida() <= 0) {
                equipeCPU.removePersonagemEquipeJogador(Acoes.getEquipeJogador().getPersonagemJogador(i));
            }
        }
        controle = Acoes.getEquipeCPU().getListaEquipeCPU().size();
        for (int i = 0; i < controle; i++) {
            if (Acoes.getEquipeCPU().getPersonagemCPU(i).getQuantidadeVida() <= 0) {
                equipeCPU.removePersonagemEquipeCPU(Acoes.getEquipeCPU().getPersonagemCPU(i));
            }
        }
        
        if (Acoes.getEquipeCPU().getListaEquipeCPU().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Parabéns, você venceu!!!");
          
        } else if (Acoes.getEquipeJogador().getListaEquipeJogador().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Você perdeu, melhor sorte na próxima. :(!!!");
        }
    }

    public static void atacarAdversario(Personagem agressor, Personagem atacado) {

         if (atacado.getQuantidadeVida() > 0) {
         JOptionPane.showMessageDialog(null, agressor.atacar(atacado));
         } else {
         JOptionPane.showMessageDialog(null,"Personagem atacado já está morto.");
         }
    }

    public static void regeneraAliado(Protagonista curador, Personagem regenerado) {
        curador.incrementarVida(regenerado, curador.calcularFatorIncremento());
    }

    public static void iniciaEquipeCPU() {
        int contadorMago = 1;
        int contadorPaladino = 1;
        int contadorGuerreiro = 1;
        int controle = Acoes.getEquipeJogador().getListaEquipeJogador().size();
        for (int i = 0; i < controle; i++) {
            Personagem novoPersonagemCPU;
            Personagem personagem = Acoes.getEquipeJogador().getPersonagemJogador(i);
            if (personagem instanceof Mago) {
                novoPersonagemCPU = new Mago("Mago" + Integer.toString(contadorMago));
                contadorMago++;
            } else if (personagem instanceof Paladino) {
                novoPersonagemCPU = new Paladino("Paladino" + Integer.toString(contadorPaladino));
                contadorPaladino++;
            } else {
                novoPersonagemCPU = new Guerreiro("Guerreiro" + Integer.toString(contadorGuerreiro));
                contadorGuerreiro++;
            }
            equipeCPU.adicionaPersonagemEquipeCPU(novoPersonagemCPU);
        }
    }

    public String getInformacaoPersonagem(Personagem personagem) {
        return personagem.informacaoPersonagem();
    }

}
