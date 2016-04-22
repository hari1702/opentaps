package opentapsgroups;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Listeners implements IAnnotationTransformer  {
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equals("mergeLead")){
			annotation.setEnabled(true);
		}
	}
}
