package sazartc.google_test.page_objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
 * PageObject class for Google Searched Pictures
 */
public class SearchedPicturesPage extends PageObjectBase {

    private List<WebElement> pictures;

    public SearchedPicturesPage(WebDriver driver) {
        super(driver);
    }
    //TODO assertions only in test classes, in test methods
    public boolean checkPicturesCountIsNotLessThan(int minimalPicturesCount) {
        pictures = driver.findElements(By.xpath(properties.getProperty("PICTURES")));
        return (pictures.size() >= minimalPicturesCount);
    }
    //TODO make it versatile, use file name as a parameter
    //TODO screenshot must be placed to /src/main/resources
    public void doScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot.png"));
    }
    //TODO rename, clickBlaBla() etc
    public GoogleHomePage getGoogleHomePage() {
        driver.findElement(By.id(properties.getProperty("HEAD_LOGO"))).click();
        return new GoogleHomePage(driver);
    }
}
