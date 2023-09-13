package com.cucumber.demo.fizzbuzz;

public class AlgoritmoFizzbuzz {

  public AlgoritmoFizzbuzz() {

  }

  public String fizzbuzz(int numero) {
    String resultado = "";
    if (numero % 3 == 0) {
      resultado = resultado.concat("fizz");
    }
    if (numero % 5 == 0) {
      resultado = resultado.concat("buzz");
    }

    return resultado.isEmpty() ? String.valueOf(numero) : resultado;
  }
}
