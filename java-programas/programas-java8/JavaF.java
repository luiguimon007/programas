import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.*;
import java.util.stream.Collectors;
import java.util.List;
public class JavaF{
    private static final Logger LOG = Logger.getLogger(JavaF.class.getName());
    private static final String description = "Review the result: {0}";
    enum Gender{
        MALE,FEMALE
    }
    public static void main(String[] args) {
       
        int incremento = incrementByOne(1);
        LOG.log(Level.INFO, description, String.valueOf(incremento));
        int increment = incrementByOneFunction.apply(10);
        LOG.log(Level.INFO,description, String.valueOf(increment));
        int result = addAndThenMultiplyByFunction.apply(4, 100);
        LOG.log(Level.INFO,description, result);
        LOG.log(Level.INFO,description, isPhoneNumberVerification.test("077000"));

        List<Person> people = List.of(
            new Person("John",Gender.MALE),
            new Person("Jose",Gender.MALE),
            new Person("Vero",Gender.FEMALE),
            new Person("Alex",Gender.MALE),
            new Person("Yuri",Gender.FEMALE)
        );
        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toSet())
            .forEach(gender -> LOG.log(Level.INFO, description, String.valueOf(gender)));

        boolean respuesta = people.stream()
                .anyMatch(p -> Gender.FEMALE.equals(p.gender));
        LOG.log(Level.INFO,description,respuesta);
    }


    static IntFunction<Integer> incrementByOneFunction = 
        number -> number+1 ;

    static IntFunction<Integer> multiply10Function = 
        number -> number*10;

    static BiFunction<Integer,Integer,Integer> addAndThenMultiplyByFunction = 
        (incrementFunction,multiplyFunction) -> (incrementFunction + 2) *  multiplyFunction;
    
    
    static Predicate<String> isPhoneNumberVerification = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Supplier<List<String>> getConnectionUrl = () 
        -> List.of("jdbc://localhost:5232/users","jdbc://localhost:8032/users");

    static int incrementByOne (int number){
        return number+1;
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Person {" +
                "name='"+ name+'\''+
                ", gender"+ gender +
                '}';
        }
    }
    
}