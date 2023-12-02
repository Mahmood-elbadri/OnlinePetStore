package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {
    public static void takeScreenShot(WebDriver driver, String name) throws IOException {
        Path dest = Paths.get("./Screenshots", name + ".png");
        try {
            Files.createDirectories(dest.getParent());
            OutputStream out = Files.newOutputStream(dest);
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {
            System.out.println("Exception while taking the screenshot: " + e.getMessage());
            throw e; // Rethrow the exception to propagate it further
        }
    }
}
