Funcionalidade: Login de Usuário

  Como um usuário registrado
  Eu quero fazer login no sistema
  Para acessar minha conta

  Cenário: Login Válido
    Dado que estou na página de login
    Quando preencho o campo "Login" com "qa-test"
    E preencho o campo "Senha" com "qa-test"
    E clico no botão "Entrar"
    Então devo ser redirecionado para a página principal

  Cenário: Login Inválido
    Dado que estou na página de login
    Quando preencho o campo "Login" com "usuario-invalido"
    E preencho o campo "Senha" com "senha-invalida"
    E clico no botão "Entrar"
    Então devo ver uma mensagem de erro

  Funcionalidade: Cadastro de Usuário

  Como um administrador do sistema
  Eu quero cadastrar novos usuários
  Para conceder acesso ao sistema

  Cenário: Cadastrar Usuário Válido
    Dado que estou na página de cadastro de usuário
    Quando preencho o campo "Nome" com "Nome do Usuário"
    E preencho o campo "Data de Nascimento" com "15/03/1988"
    E preencho o campo "Estado" com "São Paulo"
    E preencho o campo "Cidade" com "São José dos Campos"
    E clico no botão "Salvar"
    Então devo ver uma mensagem de sucesso
    E o usuário é adicionado à lista de usuários

  Cenário: Cadastrar Usuário com Informações Inválidas
    Dado que estou na página de cadastro de usuário
    Quando preencho o campo "Nome" com um valor inválido
    E preencho o campo "Data de Nascimento" com um formato inválido
    E preencho o campo "Estado" com um valor inválido
    E preencho o campo "Cidade" com um valor inválido
    E clico no botão "Salvar"
    Então devo ver mensagens de erro indicando os campos inválidos
