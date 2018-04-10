/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientproductdb;

/**
 *
 * @author Queralt
 */

public class main {
        public static void main(String[] args) {
        NewJerseyClient product = new NewJerseyClient();
        System.out.println(product.countREST());
    }
}