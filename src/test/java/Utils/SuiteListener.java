package Utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import Base.BaseClass;

public class SuiteListener implements ITestListener, IAnnotationTransformer{
	
	 public void onTestFailure(ITestResult result) {
		    
		 String filename=System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+ result.getMethod().getMethodName();//Capture the screenshot & store it on screenshot folder 
		 File f1= ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
		 
		 try {
			FileUtils.copyFile(f1, new File(filename +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
	 
	 public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		 annotation.setRetryAnalyzer(RetryAnalyzer.class);
		   
		  }


}
