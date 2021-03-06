<h1>EXERCÍCIOS DE JAVA E ORIENTAÇÃO A OBJETOS - TREINAMENTO RD</h1>

<h3>Exercício 01:</h3>

<h5>package exercicio01:</h5>

A classe Exercicio01 contém um método <i>main()</i> cuja implementação realiza a impressão no console de todos os números primos contidos nos 10 primeiros números da sequência de Fibonacci.

No entanto, a implementação não está completa. Para completá-la, você deve:

1 - Implementar o método <i>public int[] getSequenciaFibonacciDe(int tamanho)</i>, que está declarado na classe Fibonacci.

Este método deve retornar um array contendo uma sequencia de números inteiros de Fibonacci.
     
A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
anteriores, começando por 1 e 2.
     
Ex.: Uma sequência Fibonacci de tamanho 10: {1, 2, 3, 5, 8, 13, 21, 34, 55, 89}

2 - Implementar o método <i>public Set<Integer> getNumerosPrimosDe(Set<Integer> numeros)</i>, que está declarado na classe NumeroPrimo.

Este método deve retornar um conjunto contendo os números primos contidos num conjunto de inteiros passado no parâmetro,

OBS.: Um número primo é aquele número inteiro ímpar que somente é divisível por 1 e por ele mesmo.

OBS. 2: O número 2 é o único número inteiro par que é primo.

Ex.: O número 5 é primo porque não é divisível por 3 (o resultado da divisao de 5 por 3 dá um numero decimal), somente por 1 e o próprio 5.

3 - Implementar o método <i>private static Set<Integer> getSetDe(int[] numeros)</i>, que está declarado na classe Exercicio01.

Este método deve retornar um conjunto contendo os números que vieram no array de inteiros passado no parâmetros.


<h3>Exercício 02:</h3>

<h5>package exercicio02:</h5>

A classe Exercicio02 contém um método <i>main()</i> cuja implementação realiza a criação dos objetos que representam todos os funcionários de um dado departamento e imprime no console o valor do orçamento anual para pagamento dos seus salários.

No entanto, a implementação não está completa. Para completá-la, você deve:

1 - Implementar a classe abstrata Funcionario.

Um funcionário deve conter, pelo menos, os dados nome e salário mensal. Também deve implementar um método para retornar o salário anual do funcionário. A fórmula do salário anual é o valor do salário mensal vezes 13.

2 - Implementar a classe AuxiliarEscritorio.

Um auxiliar de escritório é um funcionário que, além do salário mensal, recebe um bônus anual fixo. Sendo assim, o método que calcula o salário anual de um auxiliar de escritório deve retornar seu salário mensal vezes 13, mais o valor fixo de bônus anual.

3 - Implementar a classe TecnicoManutencao.

Um técnico de manutenção é um funcionário especial pois, além do salário mensal, ele recebe um adicional de insalubridade mensal, que é um percentual calculado sobre seu salario mensal. Além disso, ele também recebe um bônus anual fixo, como o auxiliar de escritório.

Sendo assim, o método que calcula o salário anual de um técnico de manutenção deve considerar os salários mensais que ele recebe, mais os adicionais mensais de insalubridade e mais o valor fixo de bônus anual.

4 - Implementar a classe Gerente.

Um gerente é um funcionário que, além do salário mensal, recebe um bônus anual variável, que é calculado com base num percentual de bônus anual sobre seu salário mensal.

Sendo assim, o método que calcula o salário anual de um gerente deve retornar seu salário mensal vezes 13, mais o bônus anual que é o percentual de bonus vezes seu salário mensal.

5 - Implementar o método <i>private static double calculaOrcamentoAnual(List<Funcionario> funcionarios)</i>, que está declarado na classe Exercicio02.

O método deve retornar o valor da soma dos salários anuais de todos os funcionários contidos na lista passada como parâmetro.


<h3>Exercício 03:</h3>

</h5>package exercicio03:</h5>

A classe Exercicio03 contém um método <i>main()</i> cuja implementação obtém uma lista de produtos do Site da empresa, com as políticas de preços e descontos para cada produto, e faz a impressão no console dessa lista de produtos com seus respectivos preços de venda e preços promocionais.

No entanto, a implementação não está completa. Para completá-la, você deve:

<ol>
<li>Implementar o código-fonte do arquivo Produto.java</li>
<li>Implementar o código-fonte do arquivo Medicamento.java</li>
<li>Implementar o código-fonte do arquivo OTC.java</li>
<li>Implementar o código-fonte do arquivo Perfumaria.java</li>
<li>Implementar o trecho de código que deve criar um Map com a política de desconto do Site da empresa</li>
</ol>

<br>
<b>Informações sobre o modelo do cadastro de produtos:</b>
<br>
<br>

<ul>
<li>Todos os produtos possuem: código ID, nome, preço de venda e percentual de desconto aplicado no site</li>
<li>Os produtos do tipo OTC possuem um preço promocional definido no cadastro</li> 
<li>Os produtos do tipo Perfumaria também possuem um preço promocional definido no cadastro e, além disso, dados referentes a qtde e preço do produto na modalidade LMPM (Leve Mais, Pague Menos)</li>
<li>Os produtos do tipo Medicamento não possuem um preço promocional definido no cadastro, nem dados de LMPM</li>
</ul>

<br>
<b>O sistema não pode permitir (ou seja, deve lançar exceção quando) a criação de um produto com alguma regra de validação não satisfeita:</b>
<br>
<br>

<ul>
<li>Preço de venda: não pode ser menor ou igual a zero</li> 
<li>Preço promocional definido no cadastro:  não pode ser menor ou igual a zero e não pode ser maior ou igual ao preço de venda</li>
<li>Preço de LMPM: não pode ser menor ou igual a zero e não pode ser maior que o preço de venda</li>
<li>Desconto aplicado no site: deve ser 0 <= desconto < 100</li>
</ul>

<b>Regras de descontos do Site da empresa:</b>

<ul>
<li>O percentual de desconto de Medicamento é sempre de 20%</li> 
<li>O percentual de desconto de OTC é sempre de 10%</li>
<li>O percentual de desconto de Perfumaria é sempre de 5%</li>
</ul>

<b>Regras de cálculo de preços promocionais por tipo de produto:</b>

<ul>
<li>Medicamento: (preço de venda - %desconto)</li>
<li>OTC: o menor entre preço promocional e (preço de venda - %desconto)</li>
<li>Perfumaria: o menor entre preço promocional, preço LMPM e (preço de venda - %desconto)</li>
</ul>


