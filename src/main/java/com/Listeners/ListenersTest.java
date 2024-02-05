package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.CommonActions.CommonActions;
import com.Log.Log;

public class ListenersTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
			}

	@Override
	public void onTestFailure(ITestResult result) {
	CommonActions.screenShot(result.getTestName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
			}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
		}

	@Override
	public void onFinish(ITestContext context) {
		}

	
}
