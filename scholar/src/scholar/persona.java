/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

/**
 *
 * @author estudiante
 */
public class persona {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireción() {
        return direcion;
    }

    public void setDireción(String Direción) {
        this.direcion = Direción;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTipo_de_sangre() {
        return Tipo_de_sangre;
    }

    public void setTipo_de_sangre(String Tipo_de_sangre) {
        this.Tipo_de_sangre = Tipo_de_sangre;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String nombre;
     public String identificacion;
     public String edad;
     public String genero;
    public String direcion;
     public String fecha_nacimiento;
     public String Nacionalidad;
     public String Tipo_de_sangre;
     public String Estado_civil;
public int  año_actual=2019;
    public int año_nacimiento=1999;  
    public String apellido;
   public  String profession;
   
   
    public void printNombre (){
        System.out.println( "Tu nombre es: " + this.nombre    );
    }
    public void Printidentificacion (){
        System.out.println(" Tu identificacion es: " + this.identificacion);
    }
    public void printedad1 (){
        System.out.println("Tu edad es:  " + this.edad);
    }
    public void printgenero (){
        System.out.println(" Su genero es: "+ this.genero);
    }
    public void printdireción (){
        System.out.println(" tu direción es:  " + this.direcion);
    }
    public void printfecha_nacimiento (){
        System.out.println("Su nacimiento es: " + this.fecha_nacimiento);
    }
    public void printedad() {
        System.out.println("Edad " + calcuEdad()  );
       
    }
    public int calcuEdad (){
        return año_actual-año_nacimiento;
        
    }    
    
    
    public void printnacionalidad (){
        System.out.println("su nacionalidad es : " + this.Nacionalidad);
    }
    
    public void printtipodesangre (){
        System.out.println("su tipo de sangre: " + this.Tipo_de_sangre);
    }
    
    public void printEstado_civil () {
        System.out.println(" su estado civil es: " + this.Estado_civil);
    }
    public void printapellido (){
        System.out.println("su apellido es: " + this.apellido);
    }

   
    
    
    
    
    
    }
   

