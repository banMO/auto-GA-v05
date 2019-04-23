# Adidas page
Feature: Show product of adidas page

  Scenario: Adidas home page store
    Given 'Adidas Home page'  is loaded
    And hover in 'Hombre option'
    And click in 'futbol option'
    And get price Calzado de Fútbol
    And click in Calzado Futbol
    And select "MX 9.5" size
    When click on 'Añadir al carrito' button
    Then verify cantidad es igual a "1"
    When click on 'Ver Carrito' button
    Then Verify "CALZADO DE FÚTBOL X 18.3 TF" title is displayed
    Then Verify price should be "$1,329.00"
    Then Verify Total should be "$1,428.00"