package Model;

import java.awt.List;
import java.util.ArrayList;

public class Equipe {

    private ArrayList<Personagem> ListaEquipe;

    public void novaEquipe() {
        ListaEquipe = new ArrayList<Personagem>();
    }

    public ArrayList<Personagem> getListaEquipe() {
        return ListaEquipe;
    }

    public void adicionaPersonagemEquipe(Personagem novoPersonagem) {
        ListaEquipe.add(novoPersonagem);
    }

    public void removePersonagemEquipe(Personagem novoPersonagem) {
        ListaEquipe.remove(novoPersonagem);
    }

    public void removePersonagemPorIndice(int indice) {
        ListaEquipe.remove(indice);
    }

    public Personagem getPersonagem(int indicePersonagem) {
        if (indicePersonagem >= ListaEquipe.size()) {
            throw new IndexOutOfBoundsException("Nenhum personagem encontrado nessa posicao na equipe na equipe.");
        } else {
            return ListaEquipe.get(indicePersonagem);
        }
    }

}
