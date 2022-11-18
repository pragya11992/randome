package java_practice;

public class If_else {
    //simple if else program
    public void Simpleifelse(){
        if(5>2){
            System.out.println("5 is greater");
        }
        else {
            System.out.println("2 is greater");
        }
    }
    //if else in for loop
    public void Inforloop(){
      for (int i=0; i<=10; i=i+2)

      {
          if (i==3){
              System.out.println("loop closed");
          }
          else {
              System.out.println("loop still running "+ i);
          }

      }
    }

    public static void main(String[] args){

        If_else obj = new If_else();
        obj.Simpleifelse();
        obj.Inforloop();

    }

}
