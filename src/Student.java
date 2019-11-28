/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 * @param <code>
 * @param <name>
 * @param <password>
 */
public class Student<code,name,password> {
    private code code;
    private name name;
    private password password;
    private ArrayList<Double> mark=new ArrayList<>();

    public code getCode() {
        return code;
    }

    public void setCode(code code) {
        this.code = code;
    }

    public name getName() {
        return name;
    }

    public void setName(name name) {
        this.name = name;
    }

    public password getPassword() {
        return password;
    }

    public void setPassword(password password) {
        this.password = password;
    }
    
    public void setMark(double m){
        mark.add(m);
    }
    
    
    
}
