package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaawt.Awt;
import metodos.Metodos;
import org.openqa.selenium.By;
import pages.Element;
import pages.SelecaoVeiculo;
import runner.Executar;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Staps extends Executar {
    Element el = new Element();
    Metodos metodos = new Metodos();

    Awt awt = new Awt();

    @Before
    public void AbrirNavegador() {
        iniciarDaQui();

    }

    @Given("que eu coloque os dados pessoais")
    public void queEuColoqueOsDadosPessoais() {
        metodos.escrever(el.nomeCompleto);
        metodos.digitar("29724104087", el.cpf);
        metodos.digitar("(19) 3199-7362", el.Watts);
        metodos.digitar("teste@teste.com", el.Email);
    }

    @Given("coloque o endereco")
    public void coloqueOEndeco() {
        metodos.digitar("88905-322", el.zipecode);

        metodos.waitElement(el.btnBuscarCep);

        metodos.digitar("numero 67", el.numero);
        metodos.digitar("casa", el.complemento);
        metodos.scrollPage(0, 550);
    }

    @Given("seleciono metodo de emtrega")
    public void selecionoMetodoDeEmtrega() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1000);
        SelecaoVeiculo veiculo = new SelecaoVeiculo();
        veiculo.Entregas("Bicicleta");

    }

    @When("coloco a cnh")
    public void colocoACnh() throws InterruptedException, AWTException {
        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.clicar(el.cnh);
        awt.uplodCnh();
    }

    @When("clicar no botao cadastrar novo motorista")
    public void clicarNoBotaoCadastrarNovoMotorista() {

        metodos.clicar(el.btnCadastrar);

    }

    @Then("recebo a mensagem ai sim")
    public void receboAMensagemAiSim() throws InterruptedException {
   String mensagens = driver.findElement(By.xpath("//h2[@class='swal2-title']")).getText();
    System.out.println(" a mensagen é "+ mensagens);
        encerrarTest();
    }


    public void ivalidos() {

    }

    @Given("que eu coloque as informacoes pessoais erradas")
    public void queEuColoqueAsInformacoesPessoaisErradas() {
     metodos.escrever(el.nomeCompleto);
     metodos.digitar("297287", el.cpf);
     metodos.digitar("(11) 319362", el.Watts);
     metodos.digitar("test@teste", el.Email);

    }

    @Given("coloque o endereco incorreto")
    public void coloqueOEnderecoIncorreto() {
     metodos.digitar("905-322", el.zipecode);

     metodos.waitElement(el.btnBuscarCep);

     metodos.digitar("numero ", el.numero);
     metodos.digitar("casa", el.complemento);
     metodos.scrollPage(0, 550);

    }

    @Given("seleciono tipo de emtrega")
    public void selecionoTipoDeEmtrega() throws InterruptedException, AWTException {
     SelecaoVeiculo veiculo = new SelecaoVeiculo();
     veiculo.Entregas("Bicicleta");
        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.clicar(el.cnh);
        awt.uplodCnh();

    }

    @When("clicar no botao")
    public void clicarNoBotao() {

     metodos.clicar(el.btnCadastrar);

    }
    @Then("validar mensagens de erro em vermelho")
    public void validarMensagensDeErroEmVermelho() throws InterruptedException {
  String mensagenErro = driver.findElement(By.xpath("//span[@class='alert-error']")).getText();
        System.out.println(" essa e a mensagen de erro "+mensagenErro);
        encerrarTest();
    }

    public void negativo1() {
    }


    @Given("que coloque as informacoes pessoais")
    public void queColoqueAsInformacoesPessoais() {
     metodos.escrever(el.nomeCompleto);
     metodos.digitar("29724104087", el.cpf);
     metodos.digitar("(19) 3199-7362", el.Watts);
     metodos.digitar("teste@teste.com", el.Email);

    }

    @Given("coloque o endereco correto")
    public void coloqueOEnderecoCorreto() {

     metodos.digitar("88905-322", el.zipecode);

     metodos.waitElement(el.btnBuscarCep);

     metodos.digitar("numero 67", el.numero);
     metodos.digitar("casa", el.complemento);
     metodos.scrollPage(0, 550);

    }

    @Given("nao seleciono o metodo de entraga")
    public void naoSelecionoOMetodoDeEntraga() throws AWTException, InterruptedException {


        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.clicar(el.cnh);
        awt.uplodCnh();
    }

    @Then("deve exibir mensagens em vermelho")
    public void deveExibirMensagensEmVermelho() throws InterruptedException {
     metodos.clicar(el.btnCadastrar);
        String mensagens = driver.findElement(By.xpath("//h2[@class='swal2-title']")).getText();
        System.out.println(" a mensagen é "+ mensagens);
     evidencia.takeScreen("foto de bug teste passou sem selecionar metodos de entrega");
        encerrarTest();
    }

    public void blackBox() {


    }


    @Given("que coloque as informacoes pessoais corretas")
    public void queColoqueAsInformacoesPessoaisCorretas() {
     metodos.escrever(el.nomeCompleto);
     metodos.digitar("29724104087", el.cpf);
     metodos.digitar("(19) 3199-7362", el.Watts);
     metodos.digitar("teste@teste.com", el.Email);
    }

    @Given("preecha  o endereco  correto")
    public void preechaOEnderecoCorreto() {
     metodos.digitar("88905-322", el.zipecode);

     metodos.waitElement(el.btnBuscarCep);

     metodos.digitar("numero 67", el.numero);
     metodos.digitar("casa", el.complemento);
     metodos.scrollPage(0, 550);
    }

    @Given("seleciono dois metodo de entraga")
    public void selecionoDoisMetodoDeEntraga() {
     SelecaoVeiculo veiculo = new SelecaoVeiculo();
     veiculo.Entregas("Bicicleta");
        veiculo.Entregas("Moto");
    }

    @Then("nao deve permitir a selecionar dois metodos")
    public void naoDevePermitirASelecionarDoisMetodos() throws AWTException, InterruptedException {
        metodos.clicar(el.cnh);
        awt.uplodCnh();
    metodos.clicar(el.btnCadastrar);
        evidencia.takeScreen("foto selecionada com mensagen de erro");
        String mensagens = driver.findElement(By.xpath("//span[@class='alert-error']")).getText();
         System.out.println(" A mensagengem retornadas é "+mensagens);
        encerrarTest();
    }
    public void testFumaca(){

    }
 @Given("que coloque as informacoes")
 public void queColoqueAsInformacoes() {
  metodos.escrever(el.nomeCompleto);
  metodos.digitar("29724104087", el.cpf);
  metodos.digitar("(19) 3199-7362", el.Watts);
  metodos.digitar("teste@teste.com", el.Email);
 }
 @Given("coloque o endereco certo")
 public void coloqueOEnderecoCerto() {
  metodos.digitar("88905-322", el.zipecode);

  metodos.waitElement(el.btnBuscarCep);

  metodos.digitar("numero 67", el.numero);
  metodos.digitar("casa", el.complemento);
  metodos.scrollPage(0, 550);
 }
 @Given("coloque o metodo de entrega")
 public void coloqueOMetodoDeEntrega() {
  SelecaoVeiculo veiculo = new SelecaoVeiculo();
  veiculo.Entregas("Bicicleta");
 }
 @Given("Nao colocar a chn")
 public void naoColocarAChn() {


 }
 @Then("deve pedir pra colocar um chn valida")
 public void devePedirPraColocarUmChnValida() throws InterruptedException {
metodos.clicar(el.btnCadastrar);
     evidencia.takeScreen("foto campo cnh vazio");
     String mensagenCnh = driver.findElement(By.xpath("//span[@class='alert-error']")).getText();
     System.out.println(" a mensagem retornada é "+mensagenCnh);
     encerrarTest();
 }

 public void negativo2(){

 }
 @Given("que coloque as informacoes pessoais completo")
 public void queColoqueAsInformacoesPessoaisCompleto() {
  metodos.escrever(el.nomeCompleto);
  metodos.digitar("29724104087", el.cpf);
  metodos.digitar("(19) 3199-7362", el.Watts);
  metodos.digitar("teste@teste.com", el.Email);
 }
 @Given("coloque o endereco sem colocar o cep")
 public void coloqueOEnderecoSemColocarOCep() {
metodos.clicar(el.btnBuscarCep);
metodos.scrollPage(0,200);

 }

    @Then("nao deve deixar proceguir")
    public void naoDeveDeixarProceguir() throws InterruptedException {
evidencia.takeScreen("foto pedindo para informar cpf");
String mensangemCep = driver.findElement(By.xpath("//span[@class='alert-error']")).getText();
System.out.println("a mensagem retornada é "+mensangemCep);
encerrarTest();
 }

}



