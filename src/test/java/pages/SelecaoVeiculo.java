package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import utils.DriversFactory;

public class SelecaoVeiculo extends DriversFactory {

    public void Entregas(@NotNull String tipoVeiculo) {
        String tipoEntrega = tipoVeiculo.toLowerCase();

        if (tipoVeiculo.equalsIgnoreCase("Moto")) {
            tipoEntrega = "Moto";
        }
            if (tipoVeiculo.equalsIgnoreCase("Bicicleta")) {
               tipoEntrega = "Bicicleta";

            }
            driver.findElement(By.xpath("//ul[@class='delivery-method']//li//img[@alt='" + tipoEntrega + "']")).click();

        }
    }
