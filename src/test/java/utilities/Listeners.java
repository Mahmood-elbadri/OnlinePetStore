package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Test Succeeded");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == 2) {
            System.out.println("Failed");
        }
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("failed with time out");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("let's start");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Ended Successfully");
    }
}
