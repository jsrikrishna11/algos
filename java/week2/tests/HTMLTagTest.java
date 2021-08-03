package week2.tests;

/*

import org.junit.Test;
import week1.LinkedListUtils;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
 */

import org.junit.Test;
import week2.HtmlReader;
import week2.HtmlTag;
import week2.HtmlValidator;

import java.io.IOException;
import java.util.Queue;
import java.util.Stack;

public class HTMLTagTest {

    @Test
    public void completeTag() throws IOException {
        Queue<HtmlTag> input = HtmlReader.getTagsFromHtmlFile("week2/tests/resources/completeTags.txt");
        Stack<HtmlTag> result = HtmlValidator.isValidHtml(input);
        System.out.println(result);
    }

}
