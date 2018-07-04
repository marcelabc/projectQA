#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>

Feature: Forms
	
  Scenario Outline: Preenchimento correto do Forms
    Given I want to fill a form with my <name> and <data> and <motivation>
    Then I verify the success message appear on Forms
   
    Examples:
      | name  | 		data    | motivation    |
      |Marcela| 01/02/2018 | É legal.      |
      |Rafael | 02/02/2018 | É desafiador. |
      