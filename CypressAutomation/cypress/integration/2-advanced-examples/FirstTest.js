describe("My first test",function()
{
    it('Verify Title of the page',function()
    {
          cy.visit('https://demo.nopcommerce.com/');
          cy.title().should('eq','nopCommerce demo store');


    })
    it('Verify Title of the page negative',function()
    {
          cy.visit('https://demo.nopcommerce.com/');
          cy.title().should('eq','nopCommerce store');


    })
})