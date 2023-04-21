package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner implements ITestListener {

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Starts Test Execution" + " "+iTestContext.getName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Starts Test Execution" + " "+iTestResult.getTestName() + " "+ iTestResult.getName() );
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Finish Test Execution" + " "+iTestContext.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Write your logs, OR send to report");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test success sent to report "+ iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("failed test "+ iTestResult.getTestName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //TODO
    }


}
