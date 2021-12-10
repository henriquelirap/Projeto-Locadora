Olá. Obrigado por se interessar por minha aplicação, deixei todos meus contatos no GitHub. Mas disponibilizo meu email aqui também, henriquelirapavao@hotmail.com
Caso queira falar comigo ou se precisa de algum auxílio no seu desenvolvimento, me disponho
a ajudar naquilo que estiver ao meu alcance no conhecimento.

##Projeto desenvolvido por conta própria para matéria de Programa Orientada a Objetos 1 do curso de TSI na UTFPR.

##O projeto consiste em um sistema de locadora de carros, foi desenvolvido pensando em ter usabilidade tanto para o cliente, quanto para funcionário e gerente.

## locadora.sql contém toda a SQL necessária pra deixar o sistema funcional, usei XAMPP e PhpMyAdmin Server para criar as tabelas e manipular dados.

## Usuários de teste:

## Login: cli			
## Senha: 123
## Permissão: Cliente

## Login: fun			
## Senha: 123
## Permissão: Funcionário

## Login: adm
## Senha: 123
## Permissão: Administrador

## Demais clientes e funcionários cadastrados na empresa usam CPF como login e senha padrão 123 para teste apenas, podendo ser alterada quando quiser.

## Clientes conseguem se cadastrar na tela inicial, assim como recuperar a senha perdida através do email, caso já tenha se cadastrado.
Após logar, o cliente consegue visualizar os dados que inseriu na aba "Meus Dados", e também editar algumas dessas informações previamente inseridas. 
O cliente também tem acesso a locar um veículo, visualizar o histórico de locações dele mesmo, veículos devolvidos e em uso, assim como finalizar a devolução escolhendo forma de pagamento.

## Funcionarios tem um acesso mediano, mantendo todas as permissões de acesso do usuario, exceto efetuar locações e visualizar histórico pessoal de locações,  
porém tem livre acesso a visualização/edição de todos os clientes e seus dados, relatório de todos veículos cadastrados e suas respectiva disponibilidade, inserção de novos veículos, 
e relatório do caixa diário pra fins de conferência.

## Administrador tem o maior acesso possível, mantém todas as permissões de usuário e funcionário, exceto efetuar locações e visualizar histórico pessoal de locações.
Também possui acesso livre para remover locaçoes em aberto, relatorio de movimentações gerais do caixa e suas provisões (locações em aberto), assim como relatório, 
adição, edição e exclusão de todos os funcionários, podendo alterar também nivel de acesso dos colaboradores. O usuário admin é o único com permissão de excluir veiculo,
cliente ou funcionário do sistema.

## Recuperação de senha no menu inicial está disponível a qualquer usuario do sistema, basta saber seu usuario (CPF) e email cadastrado.