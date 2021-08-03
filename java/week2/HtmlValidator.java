package week2;
import java.util.Queue;
import java.util.Stack;

/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {

	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

		/* IMPLEMENT THIS METHOD! */
		Stack<HtmlTag> validator = new Stack<>();
		Stack<HtmlTag> output = new Stack<>();

		while(!tags.isEmpty()){

			HtmlTag currentTag = tags.remove();


			if(currentTag.isOpenTag()){
				validator.add(currentTag);
			}
			//TODO: You are supposed to send output in the order you take them in
			else if (!currentTag.isSelfClosing()){
				HtmlTag counterPart = validator.peek();
				if(!counterPart.matches(currentTag)){
					return validator;
				}
				else{
					output.add(validator.pop());
				}
			}else{

				output.add(validator.pop());
			}
			if(validator.isEmpty() && !tags.isEmpty()){
				return null;
			}


		}

		return output; // this line is here only so this code will compile if you don't modify it

	}


}

