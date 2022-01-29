import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();

		listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
		listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
		listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        System.out.println("Lista de alumnos");
        //listaAlumnos.stream().forEach(alumnos -> System.out.println(alumnos));
        //listaAlumnos.forEach(System.out::println);
        /*listaAlumnos.stream()
        .filter(nombre -> nombre.getNombres().charAt(0) == 'L' || nombre.getNombres().charAt(0) == 'G')
        .forEach(alumnos -> System.out.println(alumnos));*/

        //System.out.println(listaAlumnos.stream().count());
        /*listaAlumnos.stream()
        .filter(nota -> nota.getNota() > 9 && nota.getNombreCurso() == "PHP")
        .forEach(alumnos -> System.out.println(alumnos));

        listaAlumnos.stream().limit(2).forEach(System.out::println);

        System.out.println(listaAlumnos.stream().min((a,b) -> a.getEdad() - b.getEdad()));

        System.out.println(listaAlumnos.stream().max((a,b) -> a.getEdad() - b.getEdad()));
        System.out.println(listaAlumnos.stream().findFirst());
        listaAlumnos.stream().filter(curso -> curso.getNombreCurso().endsWith("t")).forEach(System.out::println);*/
        //listaAlumnos.stream().filter(curso -> curso.getNombreCurso().contains("a")).forEach(System.out::println);
        //listaAlumnos.stream().filter(nombre -> nombre.getNombres().length() >10).forEach(System.out::println);
        listaAlumnos.stream().filter(nombre -> nombre.getNombreCurso().startsWith("P")  && nombre.getNombreCurso().length() <= 6).forEach(System.out::println);
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        languages.stream().filter(idioma -> idioma.startsWith("J")).forEach(System.out::println);

        
        
    }
    static class Alumno {
        private int id;
        private String cedula;
        private String nombres;
        private String apellidos;
        private String nombreCurso;
        private double nota;
        private int edad;
        
        public Alumno() {
            
        }
        
        public Alumno(int id, String cedula, String nombres, String apellidos, String nombreCurso, double nota, int edad) {
            this.id = id;
            this.cedula = cedula;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.nombreCurso = nombreCurso;
            this.nota = nota;
            this.edad = edad;
        }

        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }

        public String getCedula() {
            return cedula;
        }
        
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getNombreCurso() {
            return nombreCurso;
        }

        public void setNombreCurso(String nombreCurso) {
            this.nombreCurso = nombreCurso;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return id+" | "+cedula+" | "+nombres+" | "+apellidos+" | Curso: "+nombreCurso+" | Nota: "+nota+" | Edad: "+edad;
        }
    }
    /*public double calculateAverage(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToInt(employee -> employee.getSalary())
                .average()
                .getAsDouble();
    }*/
    /* List<Product>result = productRepo.findAll()
        .stream().
        filter(producto -> producto.getCategory().equalsIgnoreCase("Books"))
        .filter(producto -> producto.getPrice() > 100)
        .collect(Collectors.toList());
        
        List<Product> result productRepo.findAll()
        .filter(producto -> producto.getCategory().equalsIgnoreCase("Toys"))
        .map(p -> p.withPrice(p.getPrice() * 0.9))
        .collect(Collectors.toList());
        */

    /*List<Order> result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getProducts())
        .stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
        .collect(Collectors.toList());
        
        
            List<Order> result = orderRepo.findAll()
        .stream()
        .sorted(Comparator.comparing(Order::getOrderDate).reversed())
        .limit(3)
        .collect(Collectors.toList());
        */
}