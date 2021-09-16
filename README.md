# SistemaPromoter

Um promoter deseja controlar todos os eventos dos quais participa e você foi contratado
para resolver este problema.

Assim que começou o trabalho, você ficou sabendo que o cadastro de um evento
necessita de: identificador único (um código), descrição, local e data de realização
(comece trabalhando com tipo String, depois, pesquise na API Java outros tipos para
trabalhar com datas), quantidade de convites colocados a venda, custos de organização e
valor da entrada.

Foi-lhe informado, também, que existem sempre 3 valores de entrada: o 1º valor é para
as entradas do tipo popular, o 2º valor é para as entradas do tipo normal e o 3º valor é
para as entradas do tipo VIP.

Alguns destes eventos são festas open bar, possuindo, assim, além de todas as
informações acima, uma relação das 4 bebidas que serão servidas. As informações da
bebida, por sua vez, são: nome, teor alcoólico, valor unitário.

Além disso, o promoter deseja que em todos os eventos fique cadastrado o número do
seu telefone. Como é muito requisitado, precisa de um meio que, quando este telefone
for alterado, todos os eventos tenham a informação atualizada.

O valor das entradas populares pode ser informado pelo usuário ou pode ser calculado
automaticamente, da seguinte forma:
• eventos open bar: R$200,00 mais 50% do valor unitário de cada bebida que será
servida;
• demais eventos: Custo de organização dividido pela quantidade de convites
colocados a venda.
O valor da entrada normal é o valor da popular + 10% deste mesmo valor
O valor da entrada vip é o valor da normal + 15% deste mesmo valor
______________________________________________________________________
1) Criar um modelo de classes que represente o contexto descrito anteriormente

2) Implemente o modelos de classe definido usando a Linguagem Java (Utilize, onde
apropriado, todos os conceitos de orientação a objetos já estudados (herança,
composição, polimorfismo, sobrecarga e sobreposição de métodos, etc).

3) Crie, também, uma classe aplicação que permita o cadastramento de 4 eventos, que
poderão ser open bar ou não (o usuário decidirá em tempo de execução).
Durante o cadastramento, deverão ser calculados, nas classes apropriadas, os valores das
entradas, de acordo com o desejo do usuário e seguindo as regras de negócio descritas
anteriormente.

Crie uma funcionalidade para alterar o telefone do promoter.
Mostre, quando o usuário desejar, todas as informações de todos os eventos cadastrados.


![Text Alt](https://github.com/marcusrolimcc/SistemaPromoter/blob/master/src/img/Entities.png)
![Text Alt](https://github.com/marcusrolimcc/SistemaPromoter/blob/master/src/img/Instance.png)
