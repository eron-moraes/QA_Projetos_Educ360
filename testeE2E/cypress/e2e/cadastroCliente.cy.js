describe('Cadastro de Clientes', () => {
  it('passes', () => {

    //Entrada e validação de entrada no sistema
    cy.viewport(1440, 900)
    cy.visit('https://educ360dev.com.br/qa-test/admin/login')


    //Login
    var logar = {
      user: 'qa-test',
      senha: 'qa-test'

    }
    cy.get(':nth-child(1) > label').type(logar.user)
    cy.get(':nth-child(2) > label').type(logar.senha)
    cy.get('.custom-control-label').click()
    cy.get('.btn').click()

    //Clientes cadastro
    cy.get('#main-menu > :nth-child(3) > a').click()
    //Novo cliente
    cy.get('[href="https://educ360dev.com.br/qa-test/admin/clientes/inserir"]').click()

    //Formulário
    var usuario = {
      nome: 'Eron',
      estado: 'São Paulo',
      cidade: 'São Paulo',
    }

    cy.get('[name="nome"]').type(usuario.nome)
    cy.get('.input-group > .form-control').type('15/03/1990')
    cy.get('[name="estado"]').type(usuario.estado)
    cy.get('[name="cidade"]').type(usuario.cidade)
    cy.get('.badge-success').click()
    cy.get('#btn_inserir_editar').click()

    cy.get('div.text-center.alert_messages.alert.alert-success.alert-dismissible')
      .should('be.visible')
      .contains('Registro inserido com sucesso')


  })

})