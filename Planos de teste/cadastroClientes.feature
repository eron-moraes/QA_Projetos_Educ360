Funcionalidade: Cadastro de Clientes
  Como um usuário administrador
  Eu quero cadastrar novos clientes
  Para manter um registro atualizado

Cenário: Cadastrar cliente com informações válidas
  Dado que estou na página de cadastro de clientes
  Quando preencho todos os campos obrigatórios corretamente
  E clico no botão de cadastro
  Então vejo uma mensagem de sucesso
  E o cliente é adicionado à lista de clientes

Cenário: Tentar cadastrar cliente com informações inválidas
  Dado que estou na página de cadastro de clientes
  Quando preencho os campos obrigatórios de forma inválida
  E clico no botão de cadastro
  Então vejo mensagens de erro indicando os campos inválidos
