package org.example.Java_jenekins_docker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
 
 @Test
public void testInputIsEven(){
 assertTrue(App.checkIfInputIsAnEvenNumber(22)); // Assertion
 }
 }