package Arrays;

public class PruebasAlumno {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Juan");
        alumnos[1] = new Alumno("Ana");
        alumnos[2] = new Alumno("Luis");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Código" + alumnos[i].getCodigo() + " Nombre: " + alumnos[i].getNombre());
        }

        Alumno al1 = new Alumno("Juan");
        Alumno al2;
        Alumno[] arrayAlumnos = new Alumno[10];
        Alumno[] arrayAlumnos2 = {new Alumno("Pedro"), new Alumno("Jorge")};

        arrayAlumnos[0] = al1;
        arrayAlumnos2[1] = new Alumno("Luis");

        for (Alumno auxAlumno:arrayAlumnos) {
            if (auxAlumno!=null) {
                System.out.println("Nombre alumno" + auxAlumno.getNombre());
            }
        }

        Alumno auxAlumno;
        for (int i = 0; i < arrayAlumnos2.length; i++) {
            auxAlumno=arrayAlumnos2[i];
            if (auxAlumno!=null) {
                System.out.println("Nombre alumno " + auxAlumno.getNombre());
            }
        }


    }

}
