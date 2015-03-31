package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author nbuser
 */
public class HelloController extends SimpleFormController {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
        //Initialize controller properties here or
        //in the Web Application Context

        setCommandClass(User.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }

    //Use onSubmit instead of doSubmitAction
    //when you need access to the Request, Response, or BindException objects
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        User name = (User) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        ModelAndView mvRegistrar = new ModelAndView("Registro");
        //MySQLAccess dao = new MySQLAccess();
        //dao.readDataBase();
        Login log = new Login();
        boolean check_user = log.getUser(name);
        if(check_user==true){
            mv.addObject("helloMessage", helloService.sayHello(name.getUser()));
             return mv;
        }else{
            mv.addObject("helloMessage", helloService.saySorry(name.getUser()));
            return mvRegistrar;
        }
    }
    
    
    
    
}