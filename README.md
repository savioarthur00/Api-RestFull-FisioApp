# Api-RestFull-FisioApp
Uma API Restful em Java com Spring Boot e autenticação JWT para gerenciar pacientes, casos clínicos e evoluções. Registre atendimentos com segurança e acompanhe o progresso dos tratamentos de forma eficiente. Ideal para fisioterapeutas que buscam organização e qualidade no atendimento.
Gerenciamento de Fisioterapia API Restful Java
Sistema de Gerenciamento de Atendimentos de Fisioterapeutas: Uma API Restful em Java com Spring Boot e autenticação JWT para simplificar o gerenciamento de pacientes, casos clínicos e evoluções. Registre atendimentos com segurança e acompanhe o progresso dos tratamentos de forma eficiente.

# Descrição
A API de Gerenciamento de Fisioterapia é uma solução completa para fisioterapeutas que desejam manter um registro detalhado de seus pacientes, casos clínicos e evoluções. Com autenticação segura e suporte a Java e Spring Boot, ela oferece um controle eficiente e organizado dos atendimentos.

# Funcionalidades
Cadastro de pacientes com informações detalhadas.
Registro de casos clínicos e evoluções.
Autenticação segura com JWT para acesso dos fisioterapeutas.
Acompanhamento do progresso do tratamento de cada paciente.
Fácil integração em sistemas de gestão de clínicas.
Pré-requisitos
Java JDK 11
Maven
Banco de Dados (por exemplo, MySQL)
Tecnologias Utilizadas
Java
Spring Boot
MySQL (ou outro banco de dados à sua escolha)


```mermaid
classDiagram
  class FisioManager {
    - usuarios: Lista<Usuario>
    + adicionarUsuario(usuario: Usuario): void
    + removerUsuario(usuario: Usuario): void
    + getUsuarios(): Lista<Usuario>
  }

  class Usuario {
    - userId: int
    - nomeUsuario: String
    - senha: String
    - pacientes: Lista<Paciente>
    + adicionarPaciente(paciente: Paciente): void
    + removerPaciente(paciente: Paciente): void
    + getPacientes(): Lista<Paciente>
  }

  class Paciente {
    - pacienteId: int
    - nome: String
    - dataNascimento: Data
    - endereco: Endereco
    - casosClinicos: Lista<CasoClinico>
    + adicionarCasoClinico(caso: CasoClinico): void
    + removerCasoClinico(caso: CasoClinico): void
    + getCasosClinicos(): Lista<CasoClinico>
  }

  class Endereco {
    - rua: String
    - cep: String
    - numeroCasa: String
    - bairro: String
  }

  class CasoClinico {
    - casoId: int
    - estado: String
    - tratamento: String
    - evolucoes: Lista<Evolucao>
    + adicionarEvolucao(evolucao: Evolucao): void
    + removerEvolucao(evolucao: Evolucao): void
    + getEvolucoes(): Lista<Evolucao>
  }

  class Evolucao {
    - evolucaoId: int
    - data: Data
    - descricao: String
    + getDetalhesEvolucao(): String
  }

  FisioManager --|> Usuario : Gerencia
  Usuario --|> Paciente : Possui
  Paciente -- Endereco : Possui
  Paciente --|> CasoClinico : Tem
  CasoClinico --|> Evolucao : Contem

```
