/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

public class EnderecoIP {
    
    
    private int OctetoIp1 = 0;
    private int OctetoIp2 = 0;
    private int OctetoIp3 = 0;
    private int OctetoIp4 = 0;
    private int BytsUser = 0;
    private int BytsSystem = 32;
    
    private int Byts0 = 0;
    private int Byts1 = 128;
    private int Byts2 = 64;
    private int Byts3 = 32;
    private int Byts4 = 16;
    private int Byts5 = 8;
    private int Byts6 = 4;
    private int Byts7 = 2;
    private int Byts8 = 1;
    private int BytsTotal = 0;
    
    private int Caso0 = 0; // a soma do Byts0
    private int Caso1 = 128; // a soma do Byts1
    private int Caso2 = 192; // a soma do Byts1 + Byts2 
    private int Caso3 = 224; // a soma do Byts1 + Byts2 + Byts3 
    private int Caso4 = 240; // a soma do Byts1 + Byts2 + Byts3 + Byts4 
    private int Caso5 = 248; // a soma do Byts1 + Byts2 + Byts3 + Byts4 + Byts5 
    private int Caso6 = 252; // a soma do Byts1 + Byts2 + Byts3 + Byts4 + Byts5 + Byts6 
    private int Caso7 = 254; // a soma do Byts1 + Byts2 + Byts3 + Byts4 + Byts5 + Byts6 + Byts7 
    private int Caso8 = 255; // a soma do Byts1 + Byts2 + Byts3 + Byts4 + Byts5 + Byts6 + Byts7 + Byts8  
    
   
    private int Octeto0 = 00000000; // Binario
    private int Octeto1 = 10000000; // Binario
    private int Octeto2 = 11000000; // Binario
    private int Octeto3 = 11100000; // Binario
    private int Octeto4 = 11110000; // Binario
    private int Octeto5 = 11111000; // Binario
    private int Octeto6 = 11111100; // Binario
    private int Octeto7 = 11111110; // Binario
    private int Octeto8 = 11111111; // Binario
    
    private int Oct1Mascara = 0;
    private int Oct2Mascara = 0;
    private int Oct3Mascara = 0;
    private int Oct4Mascara = 0;

    
    private int Brodcast = 0;
    private int Rede = 0;
    private int PrimeiroRede = 0;
    private int UltimoRede = 0;
    
    

    public int getOctetoIp1() {
        return OctetoIp1;
    }

    public void setOctetoIp1(int OctetoIp1) {
        this.OctetoIp1 = OctetoIp1;
    }

    public int getOctetoIp2() {
        return OctetoIp2;
    }

    public void setOctetoIp2(int OctetoIp2) {
        this.OctetoIp2 = OctetoIp2;
    }

    public int getOctetoIp3() {
        return OctetoIp3;
    }

    public void setOctetoIp3(int OctetoIp3) {
        this.OctetoIp3 = OctetoIp3;
    }

    public int getOctetoIp4() {
        return OctetoIp4;
    }

    public void setOctetoIp4(int OctetoIp4) {
        this.OctetoIp4 = OctetoIp4;
    }

    public int getBytsUser() {
        return BytsUser;
    }

    public void setBytsUser(int BytsUser) {
        this.BytsUser = BytsUser;
    }
     
     public int CalcularBtys(){
          return (int) (BytsSystem - BytsUser);      
     
     }
     public int CalcularBtysPotencia(){
          return (int) (Math.pow(2, CalcularBtys()));
     
    }

     public String CalcularBtysMascaraDecimal(){
          
         if  ( BytsUser == 1){  
              Oct1Mascara = Caso1;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 2){
              
              Oct1Mascara = Caso2;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 3){
              
              Oct1Mascara = Caso3;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 4){
              
              Oct1Mascara = Caso4;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 5){
              
              Oct1Mascara = Caso5;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 6){
              
              Oct1Mascara = Caso6;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 7){
              
              Oct1Mascara = Caso7;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 8){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso0;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 9){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso1;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 10){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso2;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 11){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso3;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 12){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso4;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 13){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso5;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 14){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso6;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 15){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso7;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 16){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso0;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 17){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso1;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 18){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso2;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 19){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso3;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 20){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso4;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 21){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso5;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 22){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso6;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 23){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso7;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 24){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso0;
          }
         if  ( BytsUser == 25){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso1;
          }
         if  ( BytsUser == 26){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso2;
          }
         if  ( BytsUser == 27){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso3;
          }
         if  ( BytsUser == 28){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso4;
          }
         if  ( BytsUser == 29){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso5;
          }
         if  ( BytsUser == 30){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso6;
          }
         if  ( BytsUser == 31){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso7;
          }
         if  ( BytsUser == 32){
              
              Oct1Mascara = Caso8;
              Oct2Mascara = Caso8;
              Oct3Mascara = Caso8;
              Oct4Mascara = Caso8;
          }
         
          return ""+Oct1Mascara+"."+Oct2Mascara+"."+Oct3Mascara+"."+Oct4Mascara;
}
     
      public String CalcularBtysMascaraBinario(){
          if  (BytsUser == 1){
              
              Oct1Mascara = Octeto1;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
          if  (BytsUser == 2){
              
              Oct1Mascara = Octeto2;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
          if  ( BytsUser == 3){
              
              Oct1Mascara = Octeto3;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 4){
              
              Oct1Mascara = Octeto4;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 5){
              
             Oct1Mascara = Octeto5;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 6){
              
             Oct1Mascara = Octeto6;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 7){
              
             Oct1Mascara = Octeto7;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 8){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto0;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 9){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto1;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 10){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto2;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 11){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto3;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 12){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto4;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 13){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto5;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 14){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto6;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 15){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto7;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 16){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto0;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 17){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto1;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 18){
              
             Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto2;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 19){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto3;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 20){
              
            Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto4;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 21){
              
          Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto5;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 22){
              
             Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto6;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 23){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto7;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 24){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto0;
          }
         if  ( BytsUser == 25){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto1;
          }
         if  ( BytsUser == 26){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto2;
          }
         if  ( BytsUser == 27){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto3;;
          }
         if  ( BytsUser == 28){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto4;
          }
         if  ( BytsUser == 29){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto5;
          }
         if  ( BytsUser == 30){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto6;
          }
         if  ( BytsUser == 31){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto7;
          }
         if  ( BytsUser == 32){
              
              Oct1Mascara = Octeto8;
              Oct2Mascara = Octeto8;
              Oct3Mascara = Octeto8;
              Oct4Mascara = Octeto8;
          }
              return ""+Oct1Mascara+"."+Oct2Mascara+"."+Oct3Mascara+"."+Oct4Mascara ;
      }
    
      public String CalcularIPBrodcast(){
          if  (BytsUser == 1){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 2){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 3){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 4){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 5){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 6){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 7){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 8){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  (BytsUser == 9){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 10){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 11){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 12){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 13){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 14){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 15){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 16){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  (BytsUser == 17){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 18){
              
             Brodcast = (int) Math.pow(2, 7)-1;
          }
          if  ( BytsUser == 19){
              
             Brodcast = (int) Math.pow(2, 2)-1;
          }
          if  ( BytsUser == 20){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 21){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 22){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 23){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 24){
              
             Brodcast = (int) Math.pow(2, 8)-1;
          }
          if  ( BytsUser == 25){
              
             Brodcast = (int) Math.pow(2, 7)-1;
          }
          if  ( BytsUser == 26){
              
             Brodcast = (int) Math.pow(2, 6)-1;
          }
          if  ( BytsUser == 27){
              
             Brodcast = (int) Math.pow(2, 5)-1;
          }
          if  ( BytsUser == 28){
              
             Brodcast = (int) Math.pow(2, 4)-1;
          }
          if  ( BytsUser == 29){
              
             Brodcast = (int) Math.pow(2, 3)-1;
          }
          if  ( BytsUser == 30){
              
             Brodcast = (int) Math.pow(2, 2)-1;
          }
          if  ( BytsUser == 31){
              
             Brodcast = (int) Math.pow(2, 1)-1;
          }
          if  ( BytsUser == 32){
              
             Brodcast = (int) Math.pow(2, 0);
          }
          
              return ""+Brodcast;
      
}      
      public String CalcularUltimoRede(){
          
          if  ((BytsUser >= 1) && (BytsUser < 33)) {
              
              UltimoRede = (Brodcast-1);
          }
          
              return ""+UltimoRede;
      
}
      public String CalcularPrimeiroRede(){
          
         if  ((BytsUser >= 1) && (BytsUser < 33)) {
              
              PrimeiroRede = ((Brodcast-UltimoRede));
          }
             return ""+PrimeiroRede;
             
      }
      public String CalcularIPRede(){
          if  ((BytsUser >= 1) && (BytsUser < 33)) {
              
              Rede = ((Brodcast-UltimoRede)-1);
          }
             return ""+Rede;
      
}
      public String qtdHost(){        
            int diferenca = BytsSystem - this.BytsUser;            
            int qtdHost = (int)Math.pow(2, diferenca);
            
            return "" + qtdHost;
   
     }
      public String qtdHost1(){        
            int diferenca = BytsSystem - this.BytsUser;            
            int qtdHost = (int)Math.pow(2, diferenca);
            
            return "" + (qtdHost - 2);
   
     }
}
       
 
  
    
    
     
    

        
 
