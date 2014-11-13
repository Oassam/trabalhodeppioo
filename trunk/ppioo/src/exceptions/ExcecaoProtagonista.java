package exceptions;

import java.io.IOException;

public class ExcecaoProtagonista extends IOException {

    private static final long serialVersionUID = 1L;

    public ExcecaoProtagonista(String mensagem) {
        super(mensagem);
    }

}
