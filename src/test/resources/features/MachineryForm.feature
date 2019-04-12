# Machinery form feature review the behavior in this feature
Feature: Machinery form

  Background: show the machinary form to add new machinery
    Given 'Machineries Page' page is loaded

  Scenario: click on Machineries option
    And redirect to 'Machinery' page

  Scenario: click on plusIcon on machineries page
    Given 'Machineries Page' page is loaded
    And redirect to 'Machinery' page
    And show 'Machinery form' page

  Scenario Outline: click on plusIcon on machineries page
    Given 'Machineries Page' page is loaded
    And redirect to 'Machinery' page
    And fill "<Machinary Name>", "<Description>", "<Stock>","<Modelo>", "<Marca>" ,"<Type>", "<Image>", "<Categoria>" nombre maquinaria campo en 'set all fields'

  Examples:
    |Machinary Name   |                             Description                            | Stock | Modelo | Marca |   Type   | Categoria |Image |
    |Motobomba Honda 2|Liviana y compacta bomba serie WB, facil arranque y solda reistencia|   20  | WB20XH | HONDA | Agricola | Motobombas| C:\Users\Ana\Downloads\maquinaria_3.jpg |

  Scenario Outline: click on editIcon on machineries page
    Given 'Machineries Page' page is loaded
    And redirect to 'Machinery' page
    And fill "<newDescription>" click on 'edit button' and edit the description with

   Examples:
     | newDescription |
     | Liviana y compacta bomba serie WB|

  Scenario: click on deleteIcon on machineries page
    Given 'Machineries Page' page is loaded
    And redirect to 'Machinery' page
    And 'deleteMachinary' of the machinaries list