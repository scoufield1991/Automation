package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utils.Waiters;

import java.time.Duration;

import static org.junit.Assert.*;

public class StepDefinitions {
    MainPage mainPage;
    ProductsPage productsPage;
    BasketPage basketPage;
    Alert alert;
    @Given("I login as non registered user on haircarepanda")
    public void i_login_as_non_registered_user_on_haircarepanda() {
        ProviderForDriver.INSTANCE.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        mainPage = new MainPage();
        mainPage.clickCookieButton();
    }

    @Given("I select category “gummies”")
    public void i_select_category_gummies() {
        productsPage = mainPage.selectCategory();
    }
    @Given("I put cursor on product")
    public void i_put_cursor_on_product() {
        productsPage.moveToProduct();
    }
    @When("I tap on “Buy now” button")
    public void i_tap_on_buy_now_button() throws InterruptedException {
        productsPage.clickBuy();
        basketPage = productsPage.clickBasket();

    }
    @Then("the basket page is displayed with selected previously product")
    public void the_basket_page_is_displayed_with_selected_previously_product() throws InterruptedException {
        Assertions.assertTrue(basketPage.checkBasket().isDisplayed());
        Assertions.assertTrue(productsPage.checkProduct().isDisplayed());
    }

    @Given("I add product to basket")
    public void i_add_product_to_basket() throws InterruptedException {
        mainPage.moveMainToProduct();
        mainPage.addProductToBasket();
    }

    @Given("I navigate to basket")
    public void i_navigate_to_basket() throws InterruptedException {
        basketPage = mainPage.clickBasket();
    }
    @When("I tap on “delete” icon near product name")
    public void i_tap_on_delete_icon_near_product_name() throws InterruptedException {
        basketPage.deleteFromBasket();
        ProviderForDriver.INSTANCE.getDriver().switchTo().alert().accept();
    }
    @Then("the message “Your shopping cart is empty An empty basket is a sad basket” is displayed")
    public void the_message_your_shopping_cart_is_empty_an_empty_basket_is_a_sad_basket_is_displayed() {
        Assertions.assertTrue(basketPage.emptyCartText().contains("Your shopping cart is empty"));
        Assertions.assertTrue(basketPage.emptySadCart().isDisplayed());
    }

    @When("I tap on “+” icon near product name")
    public void i_tap_on_icon_near_product_name() throws InterruptedException {
        basketPage.cartElementPlus();
        basketPage.checkBasket();
        basketPage.checkCount();
    }

    @Then("the quantity of products is increased")
    public void the_quantity_of_products_is_increased() {
        //Ошибка для скриншота
        Assertions.assertFalse(basketPage.checkCounter().contains("2"));
        //Assertions.assertTrue(basketPage.checkCounter().contains("2"));
    }
    @Then("the price is calculated correctly")
    public void the_price_is_calculated_correctly() {
        Assertions.assertTrue(basketPage.increasePrice().contains("121,60 $"));
    }
}
