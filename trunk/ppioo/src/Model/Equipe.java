package Model;


import java.util.ArrayList;

public class Equipe {
    
    private String nome;

    private static ArrayList<Personagem> ListaEquipeJogador;
    private static ArrayList<Personagem> ListaEquipeCPU;
    
    public void EquipeJogador() {
        ListaEquipeJogador = new ArrayList<>();
    }

    public ArrayList<Personagem> getListaEquipeJogador() {
        return ListaEquipeJogador;
    }

    public void adicionaPersonagemEquipeJogador(Personagem novoPersonagem) {
        ListaEquipeJogador.add(novoPersonagem);
    }

    public void removePersonagemEquipeJogador(Personagem personagem) {
        ListaEquipeJogador.remove(personagem);
    }

    public void removePersonagemPorIndiceJogador(int indice) {
        ListaEquipeJogador.remove(indice);
    }

    public static Personagem getPersonagemJogador(int indicePersonagem) {
        if (indicePersonagem >= ListaEquipeJogador.size()) {
            throw new IndexOutOfBoundsException("Nenhum personagem encontrado nessa posicao na equipe na equipe.");
        } else {
            return ListaEquipeJogador.get(indicePersonagem);
        }
    }

    public String getNomeJogador() {
        return nome;
    }

    public void setNomeJogador(String nome) {
        this.nome = nome;
    }

    public void setListaEquipeJogador(ArrayList<Personagem> ListaEquipe) {
        this.ListaEquipeJogador = ListaEquipe;
    }
    
    public void EquipeCPU() {
        ListaEquipeCPU = new ArrayList<>();
    }

    public ArrayList<Personagem> getListaEquipeCPU() {
        return ListaEquipeCPU;
    }

    public void adicionaPersonagemEquipeCPU(Personagem novoPersonagem) {
        ListaEquipeCPU.add(novoPersonagem);
    }

    public void removePersonagemEquipeCPU(Personagem personagem) {
        ListaEquipeCPU.remove(personagem);
    }

    public void removePersonagemPorIndiceCPU(int indice) {
        ListaEquipeCPU.remove(indice);
    }

    public static Personagem getPersonagemCPU(int indicePersonagem) {
        if (indicePersonagem >= ListaEquipeCPU.size()) {
            throw new IndexOutOfBoundsException("Nenhum personagem encontrado nessa posicao na equipe.");
        } else {
            return ListaEquipeCPU.get(indicePersonagem);
        }
    }

    public String getNomeCPU() {
        return nome;
    }

    public void setNomeCPU(String nome) {
        this.nome = nome;
    }

    public void setListaEquipeCPU(ArrayList<Personagem> ListaEquipe) {
        this.ListaEquipeCPU = ListaEquipe;
    }

}
