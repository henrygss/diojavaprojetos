package Model;

import Service.RegrasNegocio;


public class Conta {


        private String tipoConta;
        private String nome;
        private String sobrenome;
        private String nomeConta;
        private String numeroConta;
        private String numeroAgencia;
        private double saldo;


    
        public Conta(){};

        public Conta(String nome, String sobrenome, String tipoConta, String numeroConta, String numeroAgencia, double saldo) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.tipoConta = tipoConta;
            this.numeroConta = numeroConta;
            this.numeroAgencia = numeroAgencia;
            this.saldo = saldo;
        }

        public String getNomeConta() {
            return nomeConta;
        }

        public void setNomeConta(String nomeConta) {
            this.nomeConta = nomeConta;
        }

        public String getNome() {
            return nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setTipoConta(String tipoConta) {
            this.tipoConta = tipoConta;
        }

        public String getTipoConta() {
            return tipoConta;
        }

        public String getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(String numeroConta) {
            this.numeroConta = numeroConta;
        }

        public String getNumeroAgencia() {
            return numeroAgencia;
        }

        public void setNumeroAgencia(String numeroAgencia) {
            this.numeroAgencia = numeroAgencia;
        }
        

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String toString() {
        return "Conta{" +
            "nome= '" + nome + " " +
            "tipoConta='" + tipoConta + '\'' +
            ", numeroConta=" + numeroConta +
            ", numeroAgencia=" + numeroAgencia +
            ", saldo=" + saldo +
            '}';
        }

        

        //public double getValor() {
          //  return valor;
        //}

        //public void setValor(double valor) {
          //  this.valor = valor;
        //}

        /*public void setValorSaque(double valor) {
            this.valor = valor;
        }

        public void setValorDeposito(double valor) {
            valor = valor;
        } */



        public void depositar(double valor){

            if (valor <= 0){
                System.out.println("O valor para depósito não pode ser negativo e nem igual a zero");
            }else{
                saldo += valor;       
                System.out.println("Depósito de R$" + RegrasNegocio.formatarCasasDecimais(valor) + " efetuado com sucesso");
                System.out.println("Saldo atual: R$" + RegrasNegocio.formatarCasasDecimais(getSaldo()));
            }
            
        }

        public void sacar(double valor){
            if (valor > saldo){
                System.out.println("Saldo insuficiente para saque");
            }else if (valor <= 0){
                System.out.println("O valor para saque não pode ser negativo e nem igual a zero");
            }
            else{
                saldo-= valor;
                System.out.println("Saque de R$" + RegrasNegocio.formatarCasasDecimais(valor) + " efetuado com sucesso");
                System.out.println("Saldo atual: R$" + RegrasNegocio.formatarCasasDecimais(getSaldo()));
            }
            
        }
    }

    

