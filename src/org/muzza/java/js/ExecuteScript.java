/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.java.js;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author M Muzzammil
 */
public class ExecuteScript {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        System.out.println("Path to pick JS : " + path);
        try {
//            runScript(engine);
            
//            engine.eval(new FileReader(new File(path+"\\resource\\welcome.js")));
            engine.eval(new FileReader(new File(path+"\\resource\\test.js")));
       
//            callFunction("helloAll", engine);
            
//            callFunctionWithParam("helloYou", "Muzzammil", engine);
               
//              callOtherJSFunction("callOtherJS", engine);
//            Object val = callFunctionWithReturnValue("calSqr", 7, engine);
            
//            System.out.println("Return Value : " + val.toString());
            
            engine.eval("load(\"" + "src/org/muzza/java/js/file.js" + "\");");
            engine.eval("load(\"" + "resource/test.js" + "\");");
            callFunction("callIt", engine);
            
        } catch (ScriptException | NoSuchMethodException | FileNotFoundException ex) {
            Logger.getLogger(ExecuteScript.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private static boolean callFunction(String functionName, ScriptEngine engine) throws ScriptException, NoSuchMethodException{
        //Just to check whether your engine implemted this or not.
            Invocable inv = (Invocable) engine;
            
            //Call the JS function and also can pass parameter 
            inv.invokeFunction(functionName);
        
        
            return true;
    }
    
    private static boolean callFunctionWithParam(String functionName, String param, ScriptEngine engine) throws ScriptException, NoSuchMethodException{
        //Just to check whether your engine implemted this or not.
            Invocable inv = (Invocable) engine;
            
            //Call the JS function and also can pass parameter 
            inv.invokeFunction(functionName, param);
        
        
            return true;
    }
    
    private static Object callFunctionWithReturnValue(String functionName, Object param, ScriptEngine engine) throws ScriptException, NoSuchMethodException{
        //Just to check whether your engine implemted this or not.
            Invocable inv = (Invocable) engine;
            
            //Call the JS function and also can pass parameter 
            Object returnVal = inv.invokeFunction(functionName, param);
        
        
            return returnVal;
    }
    
    private static void runScript(ScriptEngine engine) throws ScriptException { 
        engine.eval("var x = 10;");
        engine.eval("var y = 20;");
        engine.eval("var z = x + y;");
        engine.eval("print (z);");
    }
    
    public static void callOtherJSFunction(String functionName, ScriptEngine engine)  throws ScriptException, NoSuchMethodException {
            //Just to check whether your engine implemted this or not.
            Invocable inv = (Invocable) engine;
            
            //Call the JS function and also can pass parameter 
            Object returnVal = inv.invokeFunction(functionName);
        
        
    
    }
}