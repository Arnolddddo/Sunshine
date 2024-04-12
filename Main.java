class Main{
  public static void Drink() {
    System.out.println("What will you be Drinking?");
  }
  public static void season(int temp) {
                if(temp < 2){
                    System.out.println("Cold Drink for a hot season");
                    temp+= 1;
                    season(temp);
                }
  }
  public static void main(String[] args){
      Drink();
      season(1);
  }

  }