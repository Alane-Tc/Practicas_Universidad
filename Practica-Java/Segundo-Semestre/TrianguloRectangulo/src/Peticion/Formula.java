/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peticion;
public class Formula {
  Float CA, CB;
  double respuesta;
    Float rp;
    Float Resultado(Float a,Float b){
       this.CA=a;
       this.CB=b;
      respuesta =(CA*CA)+(CB*CB);
      respuesta = Math.sqrt(respuesta);
      rp=(float)respuesta;
       return (rp);
  }}
