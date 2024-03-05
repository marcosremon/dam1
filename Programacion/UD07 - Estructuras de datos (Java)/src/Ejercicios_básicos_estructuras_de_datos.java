import java.io.*;
import java.rmi.StubNotFoundException;
import java.util.*;
import java.util.TreeMap;

public class Ejercicios_básicos_estructuras_de_datos {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Ejercicio: ");
            int ej = scanner.nextInt();
            scanner.nextLine();

            switch (ej) {
                case 1 -> ej1();
                case 2 -> ej2();
                case 3 -> ej3();
                case 4 -> ej4();
                case 5 -> ej5();
                case 6 -> ej6();
                case 7 -> ej7();
                case 8 -> ej8();
                case 9 -> ej9();
                case 10 -> ej10();
                default -> System.out.println("Ejercicio no válido");
            }
            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1. ArrayList
    //•	Crea un “ArrayList” de Strings y añade algunos elementos.
    //Luego, itera sobre la lista e imprime cada elemento.
    //•	Añade un elemento en una posición específica de la “ArrayList” y luego
    //imprime la lista completa para verificar.
    //•	Elimina un elemento de la “ArrayList”, primero por valor y luego por índice.

    private static void ej1() {
        List<String> lista = new ArrayList<>();
        lista.add("manzana");
        lista.add("cereza");
        lista.add("fresa");
        lista.add("pera");

        imprimeLaLista(lista);
        lista.add(1, "melocoton");
        imprimeLaLista(lista);

        lista.remove("pera");
        imprimeLaLista(lista);
        lista.remove(1);
        imprimeLaLista(lista);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2. HashSet
    //•	Crea un “HashSet” de enteros. Añade algunos elementos y muestra
    //que los elementos duplicados no se añaden al “HashSet”.
    //•	Prueba a eliminar un elemento y verifica si se ha eliminado correctamente.
    //•	Comprueba si un valor está presente en el “HashSet”.

    private static void ej2() {
        Set<Integer> numerosEnteros = new HashSet<>();

        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(2);
        numerosEnteros.add(3);
        numerosEnteros.add(3);
        numerosEnteros.add(3);
        numerosEnteros.add(4);
        numerosEnteros.add(5);
        numerosEnteros.add(5);

        System.out.println(numerosEnteros);
        numerosEnteros.remove(1);
        System.out.println(numerosEnteros);
        System.out.println(numerosEnteros.contains(3));
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3. TreeSet
    //•	Crea un “TreeSet” de enteros y añade algunos elementos.
    //Muestra que los elementos se almacenan en orden ascendente.
    //•	Prueba a eliminar un elemento y verifica si se ha eliminado correctamente.
    //•	Comprueba si un valor está presente en el “TreeSet”.

    private static void ej3() {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);

        //imprimir
        System.out.println(treeSet);

        //eliminar el elemento 2
        treeSet.remove(2);
        System.out.println(treeSet);

        //vemos si un elemento esta presente o no
        System.out.println(treeSet.contains(3));
        System.out.println(treeSet.contains(3));
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4. HashMap
    //•	Crea un “HashMap” que mapee Strings a enteros. Añade algunas entradas y muestra el mapa completo.
    //•	Recupera un valor de la “HashMap” a partir de una clave.
    //•	Elimina una entrada de la “HashMap” y verifica que se ha eliminado correctamente.

    private static void ej4() {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map.put("uno", 1);
        map.put("dos", 2);
        map.put("tres", 3);

        System.out.println(map);

        //recupera un valor del treeMap apartir de una clave
        int valor = map.get("dos");
        System.out.println("\t [+] el valor asociado a dos es " + valor);

        //elimina una clave del hashmap
        map.remove("tres");

        //imprime
        System.out.println(map);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 5. TreeMap
    //•	Crea un “TreeMap” que mapee Strings a enteros. Añade algunas entradas y
    //muestra que las entradas se almacenan en orden ascendente de las claves.
    //•	Recupera un valor de la “TreeMap” a partir de una clave.
    //•	Elimina una entrada de la “TreeMap” y verifica que se ha eliminado correctamente.

    private static void ej5() {
        Map<String, Integer> treeMap = new TreeMap<>();

        //añadimos unas entradas
        treeMap.put("uno", 1);
        treeMap.put("tres", 3);
        treeMap.put("dos", 2);
        System.out.println(treeMap);//ordena alfabeticamente por la clave

        //recupera un valor del treeMap apartir de una clave
        int valor = treeMap.get("dos");
        System.out.println("\t [+] el valor asociado a dos es " + valor);

        //borrar una entrada
        treeMap.remove("tres");
        System.out.println(treeMap);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 6. ArrayList
    //•	Crea una clase “Student” con campos “id”, “name” y “grade”.
    //•	Crea un “ArrayList” de “Student” y añade algunos estudiantes a la lista.
    //•	Itera sobre la lista e imprime los detalles de cada estudiante.

    private static void ej6() {
        class Student {
            int id;
            String name;
            String grade;

            public Student() {
            }

            public Student(int id, String name, String grade) {
                this.id = id;
                this.name = name;
                this.grade = grade;
            }

            @Override
            public String toString() {
                return "Student {" +
                        "id = " + id +
                        ", name = '" + name + '\'' +
                        ", grade = '" + grade + '\'' +
                        '}';
            }
        }

        // Crear un ArrayList de Student
        ArrayList<Student> students = new ArrayList<>();

        // Añadir algunos estudiantes a la lista
        Student student1 = new Student(1, "Juan", "A");
        Student student2 = new Student(2, "Ana", "B");
        students.add(new Student(3, "Carlos", "C"));
        students.add(student1);
        students.add(student2);

        // Iterar sobre la lista e imprimir los detalles de cada estudiante
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 7. HashSet
    //•	Crea una clase “Book” con campos “isbn”, “title” y “author”.
    //•	Crea un “HashSet” de “Book”. Asegúrate de sobrescribir los métodos
    //“equals” y “hashCode” en la clase “Book”.
    //•	Añade algunos libros al conjunto y muestra que los libros con el mismo “isbn” no se añaden
    //dos veces.

    private static void ej7() {
        class Book {
            String isbn;
            String title;
            String author;

            public Book(String isbn, String title, String author) {
                this.isbn = isbn;
                this.title = title;
                this.author = author;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author,
                        book.author);
            }
            @Override
            public int hashCode() {
                return Objects.hash(isbn, title, author);
            }

            @Override
            public String toString() {
                return "Book {" +
                        "isbn = '" + isbn + '\'' +
                        ", title = '" + title + '\'' +
                        ", author = '" + author + '\'' +
                        '}';
            }
        }

        // Crear un HashSet de Book
        HashSet<Book> books = new HashSet<>();

        // Añadir algunos libros al conjunto
        books.add(new Book("978-3-16-148410-0", "Libro 1", "Autor 1"));
        books.add(new Book("978-1-61-729408-6", "Libro 2", "Autor 2"));
        books.add(new Book("978-3-16-148410-0", "Libro 3", "Autor 3"));

        // Mostrar que los libros con el mismo isbn no se añaden dos veces
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 8. TreeSet
    //•	Crea una clase “Employee” con campos “id”, “name” y “salary”.
    //•	Haz que “Employee” implemente “Comparable<Employee>“ y ordene los empleados por “salary”.
    //•	Crea un “TreeSet” de “Employee” y añade algunos empleados.
    //Muestra que los empleados se almacenan en orden de salario.

    private static void ej8() {
        class Employee implements Comparable<Employee> {
            int id;
            String name;
            float salary;

            public Employee(int id, String name, float salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "Employee {" +
                        "id = " + id +
                        ", name = '" + name + '\'' +
                        ", salary = " + salary +
                        '}';
            }
            @Override
            public int compareTo(Employee empleado) {
                return Float.compare(this.salary, empleado.salary);
            }
        }

        // Crear un TreeSet de Employee
        TreeSet<Employee> employees = new TreeSet<>();

        // Añadir algunos empleados al conjunto
        employees.add(new Employee(1, "Juan", 3000.0f));
        employees.add(new Employee(2, "Ana", 2000.0f));
        employees.add(new Employee(3, "Carlos", 4000.0f));

        // Mostrar que los empleados se almacenan en orden de salario
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 9. HashMap
    //•	Utiliza la clase “Student” creada para el ejercicio de “ArrayList”.
    //•	Crea un “HashMap” que mapee “id” de “Student” a instancias de “Student”.
    //•	Añade algunos estudiantes al mapa y muestra el mapa completo.

    private static void ej9() {
        class Student {
            int id;
            String name;
            String grade;

            public Student(int id, String name, String grade) {
                this.id = id;
                this.name = name;
                this.grade = grade;
            }

            @Override
            public String toString() {
                return "Student {" +
                        "id = " + id +
                        ", name = '" + name + '\'' +
                        ", grade = '" + grade + '\'' +
                        '}';
            }
        }

        // Crear un HashMap que mapee 'id' de 'Student' a instancias de 'Student'
        HashMap<Integer, Student> students = new HashMap<>();

        // Añadir algunos estudiantes al mapa
        students.put(1, new Student(1, "Juan", "A"));
        students.put(2, new Student(2, "Ana", "B"));
        students.put(3, new Student(3, "Carlos", "C"));

        // Mostrar el mapa completo
        for (HashMap.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 10. TreeMap
    //•	Utiliza la clase “Book” creada para el ejercicio de “HashSet”.
    //•	Crea un “TreeMap” que mapee “isbn” de “Book” a instancias de “Book”.
    //•	Añade algunos libros al mapa. Muestra que los libros se almacenan en orden de “isbn”.

    private static void ej10() {
        class Book {
            String isbn;
            String title;
            String author;

            public Book(String isbn, String title, String author) {
                this.isbn = isbn;
                this.title = title;
                this.author = author;
            }
        }

        // Crear un TreeMap que mapee 'isbn' de 'Book' a instancias de 'Book'
        TreeMap<String, Book> books = new TreeMap<>();

        // Añadir algunos libros al mapa
        books.put("978-3-16-148410-0", new Book("978-3-16-148410-0", "Libro 1", "Autor 1"));
        books.put("978-1-61-729408-6", new Book("978-1-61-729408-6", "Libro 2", "Autor 2"));
        books.put("978-0-12-374856-0", new Book("978-0-12-374856-0", "Libro 3", "Autor 3"));

        // Mostrar que los libros se almacenan en orden de isbn
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    private static void imprimeLaLista(List<String> lista) {
        System.out.println();
        for (String fruta : lista) {
            System.out.println(fruta);
        }
        System.out.println();
    }
}
