
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioDeVoz();
}

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}


public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {
    }

    @Override
    public void iniciarCorreioDeVoz() {
    }

    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void adicionarNovaAba(String url) {

    }

    @Override
    public void atualizarPagina() {
    }