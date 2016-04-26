import java.lang.reflect.Method;

/**
 * Created by sivagurunathan.v on 26/04/16.
 */
final public class ClassNameValidatorCheck {

  	private static ClassNameValidatorCheck classNameValidatorCheck = new ClassNameValidatorCheck();

  	private ClassNameValidatorCheck() {

	}

  	public static ClassNameValidatorCheck getInstance(){
	  return classNameValidatorCheck;
	}

  	public boolean validate(Class clazz){

	  for (Method m: clazz.getDeclaredMethods()
			  ) {
		if(Character.isUpperCase(m.getDeclaringClass().getName().charAt(0))){
		  return true;
		}
	  }
	  	return false;

	}
}
