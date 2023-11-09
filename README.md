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

# Diagrama de classe 
```mermaid
classDiagram
  class Usuario {
    - userId: int
    - username: String
    - password: String
    + addPaciente(paciente: Paciente): void
    + removePaciente(paciente: Paciente): void
    + getPacientes(): List<Paciente>
  }

  class Fisioterapeuta {
    + atendePacientes(paciente: Paciente): void
  }

  class Paciente {
    - pacienteId: int
    - indetificacao: Identificacao
    - endereco: Endereco
    - fichasAnamnese: List<FichaAnamnese>
    + adicionarEndereco(endereco: Endereco): void
    + getEndereco(): Endereco
    + adicionarFichaAnamnese(ficha: FichaAnamnese): void
    + getFichasAnamnese(): List<FichaAnamnese>
  }

  class FichaAnamnese {
    - fichaId: int
    - identificacao: Identificacao
    - exameFisico: ExameFisico
    - historiaClinica: HistoriaClinica
    + getIdentificacao(): Identificacao
    + getExameFisico():ExameFisico
    + getHistoriaClinica():HistoriaClinica
  }
  class HistoriaClinica{
    -historiaClinicaId: int
    -queixaPrincipal:String
    -historiaDaDoenca:String
    -historiaFamiliar:String 
    -historiaPsicosocial:String 
    -habitosDeVida:String
    -medicamentos: Medicamentos
    -Cirurgias: String
    -Internações:String
    -antecedentesMaternos: String
    -habitosAlimentares:String
    -sono:String
    -antecedentesPessoais:AntecedentesPessoais
}
  class AntecedentesPessoais{
    - antecedentesPessoaisId: int
    - doençaCardiorrespiratoria: Boolean
    - constipacaoIntestinal: Boolean
    - doençaRenal: Boolean
    - hemorroidas: Boolean
    - neoplasias: Boolean
    - infeccaoUrinária: Boolean
    - diabetes: Boolean
    - obesidade: Boolean
    - alergias: Boolean
    - tabagismo/etilismo: Boolean
    - outros:String
}

class Medicamentos{
- medicamentosId: int
- tranquilizantes: boolean
- anticolinergicos: boolean
- corticoides: boolean
- hormonios: boolean
- diuréticos: boolean
- alfadrenergicos: boolean
- antidepressivos: boolean
- hipotensores: boolean
}
  class ExameFisico {
    exameFisicoId: int
  }

  class Indentificacao {
       -identificacaoId: int
       -endereco: Endereco
       -nome: String
       -sata da avaliação: Date
       -sexo: String
       -estado civil: String
       -idade: int
       -raça: String
       -data do nascimento: String
       -profissão: String 
       -ocupação: String
       -contato: Contato
       -responsável: String
       -diagnóstico Clínico: String
       -cLassificacaoDasDoencas: String
       -nomeDoMedico: String
       -especialidade: String

   }

class Contato {
    -contatoId: int
    -Telefone: String 
    -Email: String
    -NumeroDoResponsavel:String
}

  class Endereco {
    - enderecoId: int
    - rua: String
    - cep: String
    - numero: String
    - bairro: String
  }

  Usuario --|> Fisioterapeuta : É
  Fisioterapeuta --o Paciente : Atende
  Paciente --o FichaAnamnese : Possui
  Paciente --o Indentificacao: Possui
  Indentificacao --o Endereco : Contém
  Indentificacao --o Contato : Contém
  Fisioterapeuta --o Endereco : Possui
  FichaAnamnese --o Indentificacao : Contém
  FichaAnamnese --o ExameFisico : Contém
  FichaAnamnese --o HistoriaClinica : Contém
  HistoriaClinica --o Medicamentos: Possui
  HistoriaClinica --o AntecedentesPessoais: Contém
  
  



```
