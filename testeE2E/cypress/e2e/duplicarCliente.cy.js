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

        cy.get('#main-menu > :nth-child(3) > a').click()
        cy.get('.post_32 > :nth-child(4) > strong > .row-title').click()
        cy.get('.text-center > .btn').click()


    })

})