package Back_end

class PessoaFisica extends Pessoa{
    String cpf
    int idade
    List competencias = []

    PessoaFisica (String nome, String email, String estado, String cep, String descricao, String cpf, int idade){
        super(nome, email, estado, cpf, descricao)
        this.cpf = cpf
        this.idade = idade
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", competencias=" + competencias + '\'' +
                "$super.nome" + '\'' +
                "$super.email" + '\'' +
                "$super.estado" + '\'' +
                "$super.cep" + '\'' +
                "$super.descricao" + '\'' +
                ""
                '}';

    }
}
