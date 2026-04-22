# Etapa 1 — Levantamento de Requisitos  
Disciplina: Teste de Software  
Projeto: Sistema Escolar  
---

# 1. Descrição do Contexto

O sistema tem como objetivo gerenciar informações acadêmicas relacionadas a alunos, professores, turmas, matérias, avaliações, notas, presença e classificação de desempenho. O sistema permitirá cadastro e relacionamento entre essas entidades, cálculo de médias, classificação de desempenho dos alunos, controle de frequência e aplicação de regras de negócio acadêmicas, como reprovação por nota ou falta, além de alertas para desempenho crítico da turma.
---
# 2. Classes Principais e Responsabilidades

## Classe Pessoa
Responsabilidade:
- Representar atributos comuns entre alunos e professores.

Atributos:
- nome
- sobrenome
---

## Classe Aluno
Responsabilidade:
- Gerenciar informações acadêmicas do aluno.
- Controlar notas.
- Controlar presença.
- Determinar aprovação ou reprovação.
- Classificar desempenho.

Atributos:
- matricula
- notas
- frequencia
- status
---

## Classe Professor
Responsabilidade:
- Gerenciar dados do professor.
- Associar professor às matérias.
- Avaliar desempenho geral da turma.

Atributos:
- salario
- disciplinas
---

## Classe Materia
Responsabilidade:
- Representar disciplina escolar.

Atributos:
- nomeMateria
---

## Classe Turma
Responsabilidade:
- Gerenciar conjunto de alunos.
- Relacionar professor responsável.

Atributos:
- listaAlunos
- professorResponsavel
---

## Classe Avaliacao
Responsabilidade:
- Gerenciar provas e notas.
- Calcular médias.

Atributos:
- notas
---

# 3. Métodos de Cada Classe

## Classe Pessoa
```java
setNome(String nome)
```
Comportamento esperado:
Define nome da pessoa
---

```java
getNome()
```
Comportamento esperado:
Retorna nome.
---
```java
setSobrenome(String sobrenome)
```
Comportamento esperado:
Define sobrenome.
---
```java
getSobrenome()
```
Comportamento esperado:
Retorna sobrenome.
---
## Classe Aluno
```java
adicionarNota(double nota)
```
Comportamento esperado:
Adiciona nota válida.
---
```java
calcularMedia()
``
Comportamento esperado:
Retorna média das notas.
---
```java
registrarPresenca(double frequencia)
```
Comportamento esperado:
Atualiza frequência do aluno.
---
```java
verificarAprovacao()
```
Comportamento esperado:
Verifica aprovação por média e presença.
---
```java
classificarDesempenho()
```
Comportamento esperado:
Classifica desempenho do aluno.
---
## Classe Professor
```java
setSalario(double salario)
```
Comportamento esperado:
Define salário válido.
---
```java
avaliarDesempenhoTurma()
```
Comportamento esperado:
Analisa desempenho médio da turma.
---
## Classe Materia

```java
setNomeMateria(String nome)
```
Comportamento esperado:
Define nome da disciplina.
---
```java
getNomeMateria()
``
Comportamento esperado:
Retorna nome da disciplina.
---
## Classe Turma
```java
adicionarAluno(Aluno aluno)
```
Comportamento esperado:
Insere aluno na turma.
---
```java
removerAluno(Aluno aluno)
```
Comportamento esperado:
Remove aluno da turma.
---
```java
listarAlunos()
```
Comportamento esperado:
Retorna alunos cadastrados.
---
## Classe Avaliacao
```java
registrarNota(double nota)
```
Comportamento esperado:
Registra nota válida.
--
```java
validarNota()
```
Comportamento esperado:
Valida intervalo permitido.
---
```java
calcularMediaFinal()
```
Comportamento esperado:
Calcula média final.
---
# Total de Métodos Testáveis
19 Métodos
- Pessoa: 4
- Aluno: 5
- Professor: 2
- Materia: 2
- Turma: 3
- Avaliacao: 3
---
# 4. Regras de Negócio
## Regra 1
Nota deve estar entre:
```java
0.00 até 10.00
```
Caso contrário:
```java
NotaInvalidaException
```
---
## Regra 2
Nenhum atributo obrigatório pode ser:
```java
null
```
ou
```java
vazio
```
Caso contrário:
```java
IllegalArgumentException
```
---
## Regra 3
Salário do professor deve ser superior ao salário mínimo.
Caso contrário:
```java
SalarioInvalidoException
```
---
## Regra 4
Frequência abaixo de:

```java
70%
``
Aluno automaticamente:

```java
Reprovado
```
---
## Regra 5
Desempenho médio da turma abaixo de:
```java
30%
```
Gerar:

```java
RED FLAG
```
---
# 5. Cenários de Exceção por Classe
## Pessoa
- Nome vazio
Exceção:
```java
IllegalArgumentException
```
---
## Aluno
- Nota maior que 10
Exceção:

```java
NotaInvalidaException
```
---
## Professor
- Salário abaixo do mínimo
Exceção:
```java
SalarioInvalidoException
```
---
## Materia
- Disciplina sem nome
Exceção:
```java
IllegalArgumentException
```
---
## Turma
- Aluno duplicado
Exceção:
```java
AlunoDuplicadoException
```
---
## Avaliacao
- Calcular média sem notas
Exceção:
```java
IllegalStateException
```
---
# Checklist dos Requisitos

| Requisito | Status |
|----------|--------|
| Mínimo 4 classes | OK |
| Mínimo 15 métodos | OK |
| Mínimo 3 regras negócio | OK |
| 1 exceção por classe | OK |

---

Criação de variáveis informo para usarmos este método:
nomeVariavelExemplo chamado de lowerCamelCase onde a primeira letra é minúscula já o começo de outras palavras não
