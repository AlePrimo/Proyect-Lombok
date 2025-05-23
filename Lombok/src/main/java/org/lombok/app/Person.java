package org.lombok.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.management.ConstructorParameters;
import java.time.LocalDate;


//@Getter    // LAS ANOTACIONES GETTER Y SETTER GENERAN LOS METODOS COMO PUBLICOS POR DEFECTO
//@Setter    // SI QUEREMOS HACERLOS PRIVATE O PROTECTED TENEMOS QUE ENTRE PARENTESIS PASARLE EL VALUE = ACCESS LEVEL.XXX
//          // SI COLOCAMOS LA ANOTACION A NIVEL DE CLASE GENERAREMOS LOS METODOS PARA TODOS LOS ATRIBUTOS, SI COLOCAMOS LA ANOTACION SOBRE
//          // UN ATRIBUTO EN PARTICULAR , GENERARA EL METODO SOLO PARA ESE ATRIBUTO.
//
//@NoArgsConstructor  //CONSTRUCTOR VACIO  CON ACCESO PUBLICO POR DEFECTO, EL CUAL SE PUEDE MODIFICAR CON LA PROPIEDAD VALUE
//@AllArgsConstructor //CONSTRUCTOR CON TODOS LOS ATRIBUTOS  ON ACCESO PUBLICO POR DEFECTO, EL CUAL SE PUEDE MODIFICAR CON LA PROPIEDAD VALUE
//                    //TAMBIEN TENEMOS UNA PROPIEDAD QUE ES staticName = "xxxxx"  EN EL CUAL PODEMOS DARLE UN NOMBRE A ESTE CONSTRUCTOR
//                   // Y CONVERTIRLO EN UN METODO QUE PODEMOS USAR DE LA SIGUIENTE MANERA : Person.xxx(atributos, atributos, etc) Y DE ESA MANERA
//                   //CREAR UN OBJETO.
//
//
//@ToString(of = {"name","lastName"}) //EN ESTA ANOTACION PODEMOS EXCLUIR ATRIBUTOS CON exclude = {"atributo1","atributo2"} , TAMBIEN PODEMOS EXCLUIR EL NOMBRE DEL ATRIBUTO
//// Y SOLAMENTE IMPRIMIR EL VALOR DEL MISMO CON LA PROPIEDAD includeFieldsName = true o false.
//// CUANDO TENGAMOS MUCHOS ATRIBUTOS Y EL METODO EXCLUDE NO SEA OPTIMO TENEMOS LA PROPIEDAD of = {"atributo1", "atributo2"}  CON ESTO
//// LE DIREMOS QUE IMPRIMA SOLAMENTE LOS ATRIBUTOS QUE LE PASEMOS POR PARAMETRO(SIEMPRE TIENE QUE SER EL NOMBRE EXACTO DEL CAMPO)
//
//@EqualsAndHashCode //GENERACION DE METODOS EQUALS(TOMA LOS ATRIBUTOS DEL OBJETO Y LOS COMPARA CON OTRO OBJETO PARA DETERMINAR SI SON IGUALES) Y EL METODO
//// HASHCODE(GENERA UN CODIGO HASH A PARTIR DE LOS ATRIBUTOS DEL OBJETO).
//// EN ESTA ANOTACION TENEMOS LAS MISMAS PROPIEDADES QUE EN TO STRING, PODEMOS EXCLUIR O INCLUIR SOLAMENTE ALGUNOS ATRIBUTOS



//  SI QUISIERAMOS RESUMIR AUN MAS LAS ANOTACIONES PDDRIAMOS USAR  @DATA  , PERO LA MISMA DEBE ESTAR ACOMPAÑADA DE @ALLARGSCONSTRUCTOR(QUE NO LA INCLUYE)
//  Y @NOARGSCONSTRUCTOR


@Data   //ESTA ANOTACION NO SE USA CUANDO ESTAMOS CREANTO ENTIDADES
@NoArgsConstructor
@AllArgsConstructor




@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)  //ESTA ANOTACION MANEJA EL ACCESO DE TODOS LOS ATRIBUTOS, EN ESTE CASO LOS DEFINIMOS COMO PRIVATE
// SI QUISIERAMOS QUE ALGUN ATRIBUTO TUVIESE OTRO TIPO DE ACCESO(PUBLIC , PROTECTED) LO DEBERIAMOS ESPECIFICAR EN ESE ATRIBUTO COMO SE HARIA NORMALMENTE
//ESTA ANOTACION TAMBIEN TIENE LA POSIBILIDAD DE DEFINIR LOS ATRIBUTOS COMO FINAL(makeFinal = true)




@Builder // GENERA UNA CLASE DENTRO DE LA CLASE QUE IMPLEMENTA EL PATRON BUILDER ,
// LLAMANDO AL METODO BUILDER() DE LA CLASE PERSON Y CREANDO LA INSTANCIA CON EL METODO BUILD() , ESTE METODO SE PUEDE RENOMBRAR DESDE
// LAS PROPIEDADES DE LA ANOTACION  buildMethodName = "xxxx" , TAMBIEN SE LE PUEDE CAMBIAR EL NOMBRE A LA CLASE (EN ESTE CASO ES PERSONBUILDER)
//PERO GENERALMENTE SE USA ASI COMO ESTA.


public class Person {

     Long id;
     String name;
     String lastName;
     String email;
     Integer age;
     Integer phoneNumber;
     LocalDate dateOfBirth;








}
