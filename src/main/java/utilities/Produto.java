package utilities;

public class Produto {

    //Entidades da classe
    private String nomeProduto;
    private double preco;


    //Construtor da classe--------------------------------------------------------
    public Produto(String nomeProduto, double preco){

        this.nomeProduto = nomeProduto;
        this.preco       = preco;
    }
    //------------------------------------------------------------------------------

    //GETTERS-----------------------------------------------------------------------
    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public double getPreco(){
        return this.preco;
    }

    //------------------------------------------------------------------------------






}
