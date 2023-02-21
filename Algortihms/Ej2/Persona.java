package Ej2;

public class Persona {
    
    private int edad;
    private char sexo;


    public Persona() {
    }

    public Persona(int edad, char sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Persona edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Persona sexo(char sexo) {
        setSexo(sexo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return edad == persona.edad && sexo == persona.sexo;
    }

    @Override
    public String toString() {
        return "{" +
            " edad='" + getEdad() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }
    

}
