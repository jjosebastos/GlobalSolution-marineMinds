package model.arquivos;

public class Imagem extends Arquivo {
    private String formato;
    public Imagem(Long idArquivo, String nome, String tipo, int tamanho) {
        super(idArquivo, nome, tipo, tamanho);
    }

    public Imagem(Long idArquivo, String nome, String tipo, int tamanho, String formato) {
        super(idArquivo, nome, tipo, tamanho);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
