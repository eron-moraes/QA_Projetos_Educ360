Funcionalidade: Edição de Informações do Cliente
  Como um usuário administrador
  Eu quero editar as informações de um cliente
  Para manter os dados precisos e atualizados

Cenário: Editar informações de um cliente
  Dado que estou na página de edição de informações do cliente
  Quando seleciono um cliente da lista
  E atualizo suas informações
  E clico no botão de atualização
  Então vejo uma mensagem de sucesso
  E as informações do cliente são atualizadas na lista

Cenário: Tentar editar informações com dados inválidos
  Dado que estou na página de edição de informações do cliente
  Quando seleciono um cliente da lista
  E atualizo suas informações com dados inválidos
  E clico no botão de atualização
  Então vejo mensagens de erro indicando os campos inválidos
