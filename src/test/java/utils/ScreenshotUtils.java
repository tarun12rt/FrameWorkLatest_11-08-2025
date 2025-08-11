package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName) {
        if (!(driver instanceof TakesScreenshot)) {
            return null;
        }
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String relativeFolder = "/test-output/screenshots/";
        String filename = testName.replaceAll("[^a-zA-Z0-9-_\\.]", "_") + "_" + timestamp + ".png";
        String absoluteDir = System.getProperty("user.dir") + relativeFolder;
        String absolutePath = absoluteDir + filename;

        try {
            Files.createDirectories(Paths.get(absoluteDir));
            Files.copy(src.toPath(), Paths.get(absolutePath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return absolutePath; // use this for Extent embedding
    }
}
