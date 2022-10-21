package com.coralogix.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrizController {

    @GetMapping("/get-matriz-by-value/userValue")
    public String getMatrizByValue(@PathVariable String userValue) {
        doMatrix(userValue);
        return "OK";
    }

    private void doMatrix(String userValue) {
        Integer value;
        try {
            value = Integer.parseInt(userValue);

            Integer[][] matriz = new Integer[10][10];

            //manejar x
            for (int i = 0; i < 10; i++) {
                //manejar y
                for (int j = 0; j < 10; j++) {
                    if (i - 1 >= 0) {
                        Integer aux = matriz[i - 1] [j];
                        matriz[i][j] = (value * i) + aux;
                    }
                }
            }

            printMatriz(matriz);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printMatriz(Integer[][] matriz) {

        //manejar x
        for (int i = 0; i < 10; i++) {
            //manejar y
            for (int j = 0; j < 10; j++) {
                if (i - 1 >= 0) {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println("  ");
        }
    }
}
