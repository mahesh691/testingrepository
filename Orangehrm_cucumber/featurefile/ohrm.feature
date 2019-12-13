
Feature: functional testing of orangehrm
  Scenario: login test by welcome text
  
  Given  open browser
  When application open
  And login function
  Then validation test