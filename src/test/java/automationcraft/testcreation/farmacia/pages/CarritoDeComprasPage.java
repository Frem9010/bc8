package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeComprasPage extends SeleniumBase {
    public CarritoDeComprasPage(WebDriver driver) {super(driver);}

    By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");
    By mensajeOk = By.xpath("//div[@class='toast-message']");
    By contardorProducto = By.xpath("//span[@class=\"counter-number\"]");
    By btnCarrito = By.xpath("//i[@class=\"navbar-tool-icon icon-cart\"]");
    By btnVerCarrito = By.xpath("//span[normalize-space()='Ver Carrito']");

    public void irAURLfarmacia(String url){
    goToUrl(url);
    }

    public void clickBtnAgregarCarrito(){
        click(btnAgregarAlCarrito);
    }
    public String validarProductosaCarrito(){
        exwait(mensajeOk);
        if(isDisplayed(mensajeOk)) {
            return getText(mensajeOk);
        }
        return "mensaje no valido";
    }
    public void irACarritodeCompras(){
        click(btnCarrito);
        click(btnVerCarrito);
    }

}

