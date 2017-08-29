package pl.sda.poznan.Greeting;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Greeting {

    public String greet(String... names) {
        if (names == null) {
            return "Hello, my friend";
        }
        if (names.length == 1) {
            String name = names[0];
            if (name == null) {
                return "Hello, my friend";
            } else if (name.toUpperCase().equals(name)) {
                return "HELLO, " + name;
            }
            return "Hello, " + name;
        }
        if (names.length == 2) {
            return "Hello, " + names[0] + " and " + names[1];
        }else {
            String result = "Hello ";
            StringBuilder sb = new StringBuilder();
            for (int i = 0 ; i < names.length- 2; i++){
                if (!names[i].toUpperCase().equals(names[i])) {
                    return "AND HELLO, " + names[i];
                sb.append(names[i]+ ", ");
            }
            result = result + sb.toString() + names[names.length - 2] + " and " + names[names.length - 1];
            System.out.println(result);
            return result;
        }
    }
}

//    public String greet(String name1, String name2){
//        String greeting;
//        return greeting = "Hello, " + name1 + " and " + name2;
//    }
