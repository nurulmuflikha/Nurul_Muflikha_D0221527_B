/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yhummyChild;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class Day58_Java_Singleton_Pattern {
    
class Day58_Java_Singleton_Pattern{
	
	static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public String str;
	
	static Singleton getSingleInstance() {
		return instance;
	}

}
