package fizzbuzz;

import com.cucumber.demo.fizzbuzz.AlgoritmoFizzbuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

  private int numero;

  private String resultadoActual;

  private final AlgoritmoFizzbuzz algoritmoFizzbuzz = new AlgoritmoFizzbuzz();


  @When("ejecutamos la función y le pasamos el parámetro")
  public void ejecutamosLaFunciónYLePasamosElParámetro() {
    this.resultadoActual = algoritmoFizzbuzz.fizzbuzz(numero);
  }


  @Given("parámetro es {string}")
  public void parámetroEs(String numero) {
    this.numero = Integer.parseInt(numero);
  }

  @Then("Nos debe devolver {string}")
  public void nosDebeDevolver(String numeroEsperado) {
    Assertions.assertEquals(numeroEsperado, this.resultadoActual);
  }
}
