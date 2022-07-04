package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 1;

    /**
     *
     * @param iTestResult -> result of the test
     * @return true if the test method has to be retried, false otherwise
     */
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
