package TestesUnitarios

import Back_end.PessoaJuridica
import org.junit.Ignore

import static org.junit.Assert.*
import org.junit.Test

class PessoaJuridicaTest {

    @Test
    void PessoaJuridicaConstrutorTest() {

        def Pessoa = new PessoaJuridica("Criative Data", "criativedata@zgmail.com", "RS",
                "85748-69", "Empresa de técnologia com foco em inteligência de mercado.",
                "00.685.9587/2585-99", "Brasil",
                ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo",
                 "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"])


        String resultadoEsperadoNome = "Criative Data"
        assert(Pessoa.nome == resultadoEsperadoNome)

        String resultadoEsperadoEmail = "criativedata@zgmail.com"
        assert(Pessoa.email == resultadoEsperadoEmail)

        String resultadoEsperadoEstado = "RS"
        assert(Pessoa.estado == resultadoEsperadoEstado)

        String resultadoEsperadoCEP = "85748-69"
        assert(Pessoa.cep == resultadoEsperadoCEP)

        String resultadoEsperadoDescricao = "Empresa de técnologia com foco em inteligência de mercado."
        assert(Pessoa.descricao == resultadoEsperadoDescricao)

        String resultadoEsperadoCNPJ = "00.685.9587/2585-99"
        assert(Pessoa.cnpj == resultadoEsperadoCNPJ)

        String resultadoEsperadoPais = "Brasil"
        assert(Pessoa.pais == resultadoEsperadoPais)

        List resultadoEsperadoCompetencias = ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo",
                                              "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"]
        assert(Pessoa.competencias == resultadoEsperadoCompetencias)

        println "Teste construtor PessoaJuridica --> OK"
    }

    @Ignore
    void PessoaJuridicaTestAuxiliar() {

        def Pessoa = new PessoaJuridica("Criative Data", "criativedata@zgmail.com", "RS",
                "85748-69", "Empresa de técnologia com foco em inteligência de mercado.",
                "00.685.9587/2585-99", "Brasil",
                ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo",
                 "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"])

        def resultadoEsperadoPessoaJuridica = new PessoaJuridica("Criative Data", "criativedata@zgmail.com", "RS",
                "85748-69", "Empresa de técnologia com foco em inteligência de mercado.",
                "00.685.9587/2585-99", "Brasil",
                ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo",
                 "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"])

        assertEquals(Pessoa, resultadoEsperadoPessoaJuridica)

        println "Teste Construtor PessoaJurídica --> OK"

    }
}
