@Main_Operaciones_Calculadora
Feature: Realizar una operaciones con la calculadora de Windows

  @ejecutarResta
  Scenario: Ejecutar operacion reta
    Given que Juan se encuentra en la calculadora de Windows
    When Juan realiza la resta de 4 y 2
    Then el deberia de ver el resultado igual a 2
    
  @ejecutarMultiplicacion
  Scenario: Ejecutar operacion multiplicacion
    Given que Juan se encuentra en la calculadora de Windows
    When Juan realiza la multiplicacion de 3 y 7
    Then el deberia de ver el resultado igual a 21

  @ejecutarDivision
  Scenario: Ejecutar operacion division
    Given que Juan se encuentra en la calculadora de Windows
    When Juan realiza la division de 10 y 5
    Then el deberia de ver el resultado igual a 2
