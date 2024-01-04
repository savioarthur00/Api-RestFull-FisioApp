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
    
  }

  class Fisioterapeuta {
    -id: int    
    -crm: String
    -especialidade:String 
    -List<Pacientes>
    -identificacao: Identificacao
    + realizaEvolucoes(evolucao: Evolucao): void
    + preencheFichaDeAnamnese(fichaAnamnese:FichaAnamnese):void
    + addPaciente(paciente: Paciente): void
    + removePaciente(paciente: Paciente): void
    + getPacientes(): List<Paciente>  
     
  }

  class Paciente {
    - pacienteId: int
    - indetificacao: Identificacao
    - evolucao: List<Evolucao>
    - fichasAnamnese: List<FichaAnamnese>
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
    -habitosDeVida: HabitosDeVida
    -medicamentos: String
    -antecedentesPessoais:AntecedentesPessoais
    -queixaPrincipal:String
    -historiaDaDoenca:String
    -historiaFamiliar:String 
    -historiaPsicosocial:String
    -cirurgias: String
    -Internações:String
    -antecedentesMaternos: String
    -habitosAlimentares:String
    -sono:String
    
}

  class HabitosDeVida {
    -habitosDeVidaID: int
    -alergia:String
    -alimentacao: String
    -exerciciosFisicos: String
    -exerciciosFisicos_QntVezesNaSemana: int
    -ingestaoDeAguaPorDia_QuantosLitros: String
    -fumante: String
    -ingestaoDeBebidaAlcoolica: String
}
 
  class AntecedentesPessoais{
    - antecedentesPessoaisId: int
    - alergia:String
    - doençaCardiorrespiratoria: Boolean
    - constipacaoIntestinal: Boolean
    - doençaRenal: Boolean
    - hemorroidas: Boolean
    - neoplasias: Boolean
    - infeccaoUrinária: Boolean
    - diabetes: Boolean
    - obesidade: Boolean
    - tabagismo/etilismo: Boolean
    - outros:String
}

class ExameCardiorespiratorio{
  - exameCardiorespiratorioId: int
  - fc:String
  - fR: String
  - pA:String
  - spO2: int
  - temperatura: int 
  - peso: double
  - altura: double
  - iMC: double
  - auscultaPulmonar: String
  - consciência: String
  - formato Tórax:String
  - outros: String
  - viaDeAcessoDoAr:  String
  - usoDeOxigenoterapia: String
  - horario_usoDeOxigenoterapia: String
  - fiO2: String
  - padraoMuscularVentilatório: String
  - ritmoVentilatório: String
  - expansibilidadeTorácica: String
  - expansibilidadeTorácica_Assimetrica: String
  - sinais: Sinais
  - demaisSinais: String
  - sintomas: Sintomas
  - demaisSintomas: String
  - usoDeMusculaturaAcessória: String
  - tosse:String
  - secreção: String
  - dispneia: String
  - borg: String
  - classificação: String
  - escalaModificadaDoMRC_Pacientes_Portadores_DPOC:String
  - cianose: String
  - avaliaçãoPostural: String
  - palpação: String  
}

  

  class Evolucao{
    evolucaoId: int
    data:Date
    descriçãoDoEstadoGeral:String
    condutaAplicada:String
    eventuaisIntercorrências: String
    assinatura: String
}

  class Indentificacao {
       -identificacaoId: int
       -endereco: Endereco
       -nome: String
       -dataDaAvaliação: Date
       -sexo: String
       -estado civil: String
       -idade: int
       -raça: String
       -dataDoNascimento: String
       -profissão: String 
       -ocupação: String
       -contato: Contato
       -diagnósticoClínico: String
       -cLassificacaoDasDoencas: String
       

   }
  class Bebê {
    - bebeId: int
    - pesoAoNascer: String
    - tipoDeParto: String
    - idadeGestacional: int
    - intercorrenciasIntraparto: String
    - intercorrenciasPosParto: String 
    - escalaAPGAR_1Min: String 
    - escalaAPGAR_5Min: String
    - desenvolvimento: String
    - alergias: boolean
    - descricaoAlergias: String
    - imunizacoes: String
}

class Contato {
    -contatoId: int
    -Telefone: String 
    -Email: String
}

  class Endereco {
    - enderecoId: int
    - rua: String
    - cep: String
    - numero: String
    - bairro: String
  }



  Usuario <|-- Fisioterapeuta   : É um
  Fisioterapeuta --o Endereco : Possui
  Fisioterapeuta -- Paciente : Atende
  Fisioterapeuta -- Evolucao: Realiza
  Fisioterapeuta -- FichaAnamnese: Preenche
  Fisioterapeuta -- Indentificacao: Preenche
  Bebê --|> Paciente: É
  Paciente --o Evolucao: Possui
  Paciente --o FichaAnamnese : Possui
  Paciente --o Indentificacao: Possui
  Indentificacao --o Endereco : Contém
  Indentificacao --o Contato : Contém
  FichaAnamnese --o Indentificacao : Contém
  FichaAnamnese --o ExameCardiorespiratorio : Contém
  FichaAnamnese --o HistoriaClinica : Contém
  HistoriaClinica --o AntecedentesPessoais: Contém
  HistoriaClinica --o HabitosDeVida: Contém
 
  

```
