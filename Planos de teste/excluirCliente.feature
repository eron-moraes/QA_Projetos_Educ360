Funcionalidade: Exclusão de Cliente
  Como um usuário administrador
  Eu quero excluir clientes da lista
  Para manter a lista de clientes atualizada

Cenário: Excluir cliente existente
  Dado que estou na página de lista de clientes
  Quando seleciono um cliente da lista
  E clico no botão de exclusão
  Então vejo uma mensagem de confirmação de exclusão
  E confirmo a exclusão
  Então vejo uma mensagem de sucesso de exclusão
  E o cliente é removido da lista de clientes

Cenário: Cancelar exclusão de cliente
  Dado que estou na página de lista de clientes
  Quando seleciono um cliente da lista
  E clico no botão de exclusão
  Então vejo uma mensagem de confirmação de exclusão
  E cancelo a exclusão
  Então vejo que o cliente não foi removido da lista
