object ChapterOne {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(11); val res$0 = 
  
    1+2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(48); 
  	//res0 * 3
  	
  	val message = "hola mundo";System.out.println("""message  : String = """ + $show(message ));$skip(55); 
  	val anotherMessage: java.lang.String = "wasssuppp?";System.out.println("""anotherMessage  : String = """ + $show(anotherMessage ));$skip(175); 
  	//val is like final in Java! u cannot change its value
  	
  	//message = "nope, it wont work"
  	//message already exists
  	
  	val yetAnotherMessage: String = "bonjour";System.out.println("""yetAnotherMessage  : String = """ + $show(yetAnotherMessage ));$skip(23); 
  	
  	var msg = "fly";System.out.println("""msg  : String = """ + $show(msg ));$skip(20); 
  	msg = "dont fly";$skip(20); 
  	
  	println(msg);$skip(96); 
  	
  	//var allows to reassign a value
  	
  	def max(x: Int, y: Int): Int = if (x>y) x else y;System.out.println("""max: (x: Int, y: Int)Int""");$skip(140); val res$1 = 
 		//def - function definition
    //function max takes 2 parameters, return type is Int
    //function body after = sign
    
    max(2,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(47); 
    
  	def greeting() = println("I greet u");System.out.println("""greeting: ()Unit""");$skip(117); val res$2 = 

		//()Unit is like void in Java
		//Unit means that "the function returns no interesting value"

		args(0) = planet;System.out.println("""res2: <error> = """ + $show(res$2));$skip(29); val res$3 = 
		println("Hello" + args(0));System.out.println("""res3: <error> = """ + $show(res$3))}

}
