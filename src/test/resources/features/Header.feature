# Header feature review the behavior in this feature
Feature: Header

  Background: Navigation through the options on the header
    Given 'Machineries Page' page is loaded

  Scenario: click on Machineries option
    And redirect to 'Machinery' page

  Scenario: click on Machineries list option
    And redirect to 'Machineries list' page