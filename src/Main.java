
public class Main {
    public static void main(String[] args){

      boolean success = Data.Validate("AC","test1!","test");
              if(success){
                  System.out.println("Данные правильные");
              }else {
                  System.out.println("Данные неправильные");
              }
    }
}

