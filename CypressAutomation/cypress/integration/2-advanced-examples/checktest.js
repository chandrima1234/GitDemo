describe("My first test",function()
{
    it('Locating Elements',function()
    {
       cy.visit("https://rahulshettyacademy.com/AutomationPractice/");
       cy.get("#checkBoxOption1").check().should('be.checked').and('have.value','option1');
       cy.get("#checkBoxOption1").uncheck().should('not.be.checked');
       cy.get("input[type='checkbox']").check(['option2','option3']);
       cy.get('select').select('option2').should('have.value','option2');

       //dynamic dropdown

       cy.get('#autocomplete').type('ind')
       cy.get('.ui-menu-item div').each(($e1, index, list) =>
       {
          if($e1.text()== 'India'){
              $e1.click();
          }
       })
      cy.get('#displayed-text').should('be.visible');
      cy.get('#hide-textbox').click();
      cy.get('#displayed-text').should('not.be.visible');
      cy.get('#show-textbox').click();
      cy.get('#displayed-text').should('be.visible');

      cy.get("input[value='radio2']").check().should('be.checked');
      cy.get("input[value='radio2']").uncheck().should('not.be.checked');
      
    })

})