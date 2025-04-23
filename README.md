# Sistema de Diagnóstico Hospitalar

## Descrição
Este é um sistema simples de diagnóstico hospitalar desenvolvido em Java. O sistema é capaz de realizar diagnósticos preliminares com base nos sintomas informados pelo paciente e retornar orientações básicas de saúde. 

Atualmente, o sistema pode diagnosticar dois tipos de condições:
- Gripe
- COVID-19

O projeto foi estruturado utilizando conceitos de programação orientada a objetos, como herança e polimorfismo, para facilitar a manutenção e expansão futura.

## Estrutura do Projeto

### Classes Principais

1. **Diagnostico (Classe Abstrata)**
   - Base para todos os tipos de diagnóstico
   - Contém o array de sintomas comuns
   - Define o método abstrato `avaliarPaciente()`
   - Implementa o método concreto `exibirSintomasComuns()`

2. **DiagnosticoGripe**
   - Herda de `Diagnostico`
   - Implementa lógica específica para diagnóstico de gripe
   - Avalia baseado na quantidade de sintomas coincidentes

3. **DiagnosticoCovid**
   - Herda de `Diagnostico`
   - Implementa lógica específica para diagnóstico de COVID-19
   - Considera sintomas-chave específicos como perda de paladar/olfato

4. **Main**
   - Contém o método `main`
   - Executa simulações de diagnóstico


## Critérios de Diagnóstico

### Gripe
- 3 ou mais sintomas coincidentes: Provável Gripe
- 1-2 sintomas coincidentes: Possível Gripe
- 0 sintomas coincidentes: Improvável Gripe

### COVID-19
- 3 ou mais sintomas coincidentes OU presença de sintomas-chave: Possível COVID-19
- 1-2 sintomas coincidentes: Baixa probabilidade, mas não descartada
- 0 sintomas coincidentes: Improvável COVID-19

