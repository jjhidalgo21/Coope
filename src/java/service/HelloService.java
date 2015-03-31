package service;

/**
 *
 * @author nbuser
 */
public class HelloService {

    public String sayHello(String name) {
        return "Hola " + name + "!";
    }
    
    public String saySorry(String name) {
        return "Lo Siento " + name + " No Existe! /n Debe Registrarse";
    }
}