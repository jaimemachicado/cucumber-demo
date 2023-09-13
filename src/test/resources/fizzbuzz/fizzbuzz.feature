Feature: Algoritmo fizzbuzz
  Escribir una función que al pasarle un número:
  - Devuelve "fizz" si es múltiplo de 3
  - Devuelve "buzz" si es múltiplo de 5
  - Devuelve "fizzbuzz" si es múltiplo de 3 y 5
  - Devuelve el número si no es múltiplo de ninguno de los anteriores

  Scenario Outline: Pasamos un número a la función fizzbuzz
    Given parámetro es "<numero>"
    When ejecutamos la función y le pasamos el parámetro
    Then Nos debe devolver "<resultado>"
    Examples:
      | numero | resultado |
      | 1      | 1         |
      | 2      | 2         |
      | 3      | fizz      |
      | 6      | fizz      |
      | 9      | fizz      |
      | 5      | buzz      |
      | 10     | buzz      |
      | 15     | fizzbuzz  |
