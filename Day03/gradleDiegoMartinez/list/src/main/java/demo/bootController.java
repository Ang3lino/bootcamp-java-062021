package list;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bootController {

    @RequestMapping("/user")
    public User user(
        @RequestParam(value="nombre", defaultValue="Sin nombre") String nombre, 
        @RequestParam(value="edad", defaultValue="0")  int edad) {
        return new User(nombre, edad);
    }

    @RequestMapping("/")
    public String inicio() {
        return "Estamos en el índice /";
    }
}