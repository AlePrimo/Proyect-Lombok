package org.lombok.app;


import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;


@Slf4j //ANOTACION PARA HABILITAR LOS LOGS DE LOMBOK

public class Main {


    @SneakyThrows(value = {IOException.class, FileNotFoundException.class}) //CON ESTA ANOTACION  CAPTURAMOS LAS
    // POSIBLES  EXCEPCIONES DE NUESTRO CODIGO PARA NO NECESITAR MANEJARLAS EN LA FIRMA DEL MAIN


    public static void main(String[] args) throws FileNotFoundException {


//       Person pepe =  Person.builder()
//                .id(1L)
//                .age(25)
//                .name("pepe")
//                .email("pepe@mail")
//                .dateOfBirth(LocalDate.of(1987,12,1))
//                .lastName("grillo")
//                .build();
//
//
//       log.info(pepe.toString());
//
//
//        System.out.println(pepe);



        // CUANDO TENEMOS RECURSOS QUE DEBEN CERRARSE UNA VEZ QUE SE HAYAN USADO( xxx.close() ) , LOMBOK TIENE UNA ANOTACION
        // QUE REALIZA ESE CIERRE

//        @Cleanup
//        InputStream inputStream = new FileInputStream("archivo.txt"); //ESTE OBJETO INPUTSTREAM IMPLEMENTA CLOSEABLE
        // POR LO TANTO HABRIA QUE CERRARLO UNA VEZ USADO , PERO CON LA ANOTACION CLEANUP LOMBOK LO MANEJA



        // SI NO HUBIESEMOS PUESTO LA ANOTACION @SneakyThrows  EL OBJETO INPUT NOS HUBIESE PEDIDO CAPTURAR UNA EXCEPCION EN LA FIRMA DEL MAIN

        InputStream inputStream = new FileInputStream("archivo.txt");
        inputStream.close();





    }
}