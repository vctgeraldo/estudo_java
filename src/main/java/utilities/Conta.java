package utilities;

public class Conta {

    private int    numConta;
    private String nomeCliente;
    private double saldo;

    //CONSTRUTORES------------------------------------------------------------
    public Conta() {
    }

    public Conta(int numConta, String nomeCliente, double saldo){
        this.numConta    = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo       = saldo;
    }

    public Conta(int numConta, String nomeCliente) {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
    }
    //--------------------------------------------------------------------------

    //GETTERS-------------------------------------------------------------------
    public int getNumConta(){
        return this.numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    //--------------------------------------------------------------------------


    //SETTERS-------------------------------------------------------------------
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    //--------------------------------------------------------------------------


    //Deposito------------------------------------------------------------------
    public void deposito(double valor){
        this.saldo += valor;
    }
    //--------------------------------------------------------------------------

    //Saque---------------------------------------------------------------------
    public void saque(double valor){
        this.saldo -= (valor + 5.0);
    }
    //--------------------------------------------------------------------------



}
