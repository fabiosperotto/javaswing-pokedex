package br.com.ifsul.entidades;

/**
 *
 * @author fabiosperotto
 */
public class Pokemon {
    
    private int id;
    private String nome;
    private String imagem;

    public Pokemon() {
    }

    public Pokemon(int id, String nome, String imagem) {
        this.id = id;
        this.nome = nome;
        this.imagem = imagem;
    }

    public Pokemon(String nome, String imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
    
}
