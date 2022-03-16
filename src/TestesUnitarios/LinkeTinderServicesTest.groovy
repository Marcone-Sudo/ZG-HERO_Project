package TestesUnitarios

import Back_end.LinkeTinderServices
import static org.junit.Assert.*
import org.junit.Ignore
import org.junit.Test

class LinkeTinderServicesTest {

    LinkeTinderServices LTServices = new LinkeTinderServices()

    @Test
    void CadastroNovoCandidatoTest() {

        def Candidato = LTServices.CadastrarNovoCandidato("Anna", "annazitsky@gmail.com", "RS", "96600-000",
                "Engenheira de Computação", "033.985.859.77", 26,
                ["Python", "Java", "IA", "Programação Competitiva"])

        assert(LTServices.FindCandidatoByCpf(Candidato.cpf))

        println "Teste Cadastro Novo Candidato --> OK"

    }

    @Test
    void CadastroNovaEmpresaTest() {

        def Empresa = LTServices.CadastrarNovaEmpresa("Criative Data", "criativedata@zgmail.com", "RS",
                "85748-69", "Empresa de técnologia com foco em inteligência de mercado.",
                "00.685.9587/2585-99", "Brasil",
                ["Metodologias Ágeis", "Python", "Banco de Dados", "Organização", "Código Limpo",
                 "Data Science", "Data Engineer", "Responsabilidade", "Comunicação Pessoal"])

        assert(LTServices.FindEmpresaByCnpj(Empresa.cnpj))

        println "Tests Cadastro Nova Empresa --> OK"

    }
}
