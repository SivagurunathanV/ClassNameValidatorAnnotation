import com.sun.tools.internal.ws.wsdl.framework.ValidationException;

import java.lang.reflect.Method;

/**
 * Created by sivagurunathan.v on 25/04/16.
 */

@ClassNameValidator()
public class TestClassAnnotation {

  public static void main(String[] args) throws ClassNameValidationException {

	ClassNameValidatorCheck instance = ClassNameValidatorCheck.getInstance();

	  if(!instance.validate(sampleClass.class)){
		throw new ClassNameValidationException("Class Name is not valid");
	  }else{
		System.out.println("Valid class name");
	  }







//	for (Method m: TestClassAnnotation.class.getDeclaredMethods()
//		 ) {
//	  System.out.println(m.getDeclaringClass().getName());
//	  System.out.println(m.getName());
//	}
  }

}
