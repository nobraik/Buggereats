package pages;

import org.openqa.selenium.By;


public class Element  {


 public   By nomeCompleto = By.name("name");
 public By cpf = By.name("cpf");
 public By Email = By.xpath("//input[@type='email']");
 public By Watts = By.name("whatsapp");

 public By zipecode = By.name("postalcode");

 public By btnBuscarCep = By.xpath("//input[@type='button']");
 public By numero = By.name("address-number");
 public By complemento = By.name("address-details");

public By cnh = By.cssSelector("#page-deliver > form > div > p > svg");
public By btnCadastrar = By.cssSelector("#page-deliver > form > button");








}
