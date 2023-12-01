

// how to change variables from other class using this keyword

 class player {

       private int jerNo = 0;
        String name = null;

        player(int jerNo, String name){
            this.jerNo = jerNo;
            this.name = name ;
            System.out.println("In player constructor");
        }
        void info(){
            System.out.println(+jerNo + "=" +name);
        }

}

class Client{
    public static void main(String[] args) {
        
        player obj = new player(18,"virat");
        obj.info();

        player obj2 = new player(45,"Rohit");
        obj2.info();

    }
}
