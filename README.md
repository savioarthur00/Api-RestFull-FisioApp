# Api-RestFull-FisioApp
Uma API Restful em Java com Spring Boot e autenticação JWT para gerenciar pacientes, casos clínicos e evoluções. Registre atendimentos com segurança e acompanhe o progresso dos tratamentos de forma eficiente. Ideal para fisioterapeutas que buscam organização e qualidade no atendimento.

'''
classDiagram
  class Usuario {
    +id: Long
    +login: String
    +senha: String
  }

  class Paciente {
    +id: Long
    +nome: String
    +idade: int
    +endereco: Endereco
    +casosClinicos: List<CasoClinico>
  }
  
  class Endereco {
    +rua: String
    +cep: String
    +numero: String
    +bairro: String
  }

  class CasoClinico {
    +id: Long
    +estado: String
    +tratamento: String
    +evolucoes: List<Evolucao>
  }
  
  class Evolucao {
    +id: Long
    +descricao: String
    +dataRegistro: Date
  }

  class Fisioterapeuta {
    +id: Long
    +nome: String
  }

  Paciente -- CasoClinico: "Possui"
  CasoClinico -- Evolucao: "Possui"
  Fisioterapeuta --|> Usuario: "Herda"

  '''
