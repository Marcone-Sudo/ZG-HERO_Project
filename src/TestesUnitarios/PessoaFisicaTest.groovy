package TestesUnitarios

import Back_end.PessoaFisica
import static org.junit.Assert.*
import org.junit.Ignore
import org.junit.Test


class PessoaFisicaTest {

    @Test
    void PessoaFisicaConstrutorTest() {

        def Pessoa = new PessoaFisica("Anna", "annazitsky@gmail.com", "RS", "96600-000",
                "Engenheira de Computação", "033.985.859.77", 26,
                ["Python", "Java", "IA", "Programação Competitiva"])

        String resultadoEsperadoNome = "Anna"
        assert(Pessoa.nome == resultadoEsperadoNome)

        String resultadoEsperadoEmail = "annazitsky@gmail.com"
        assert(Pessoa.email == resultadoEsperadoEmail)

        String resultadoEsperadoEstado = "RS"
        assert(Pessoa.estado == resultadoEsperadoEstado)

        String resultadoEsperadoCEP = "96600-000"
        assert(Pessoa.cep == resultadoEsperadoCEP)

        String resultadoEsperadoDescricao = "Engenheira de Computação"
        assert(Pessoa.descricao == resultadoEsperadoDescricao)

        String resultadoEsperadoCPF = "033.985.859.77"
        assert(Pessoa.cpf == resultadoEsperadoCPF)

        int resultadoEsperadoIdade = 26
        assert(Pessoa.idade == resultadoEsperadoIdade)

        List resultadoEsperadoCompetencias = ["Python", "Java", "IA", "Programação Competitiva"]
        assert(Pessoa.competencias == resultadoEsperadoCompetencias)

        println "Teste Construtor PessoaFísica --> OK"
    }

    @Ignore
    void PessoaFisicaConstrutorTestAuxiliar() {

        def Pessoa = new PessoaFisica("Anna", "annazitsky@gmail.com", "RS", "96600-000",
                "Engenheira de Computação", "033.985.859.77", 26,
                ["Python", "Java", "IA", "Programação Competitiva"])

        def resultadoEsperadoPessoaFisica = new PessoaFisica("Anna", "annazitsky@gmail.com", "RS", "96600-000",
                "Engenheira de Computação", "033.985.859.77", 26,
                ["Python", "Java", "IA", "Programação Competitiva"])

        assertEquals(Pessoa, resultadoEsperadoPessoaFisica)

        println "Teste Construtor PessoaFísica --> OK"

    }

}
