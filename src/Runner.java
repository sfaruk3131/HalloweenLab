public class Runner {
    public static void main(String []args)
    {
        String[][] sta = {
                {" ","X","X","X","X"," "},
                {"X","X","X","X","X","X"},
                {"X","X","X","X","X","X"},
                {"X","X","X","X","X","X"},
                {" ","X","X","X","X"," "}
        };

        JackOLantern pumpkin = new JackOLantern(sta);
        pumpkin.toString();
        System.out.println("/n");
        pumpkin.edit("O",1,1);
        pumpkin.edit("O", 1, 4);
        pumpkin.edit("V", 3, 1);
        pumpkin.edit("V", 3,2);
        pumpkin.edit("V", 3, 3);
        pumpkin.edit("V", 3, 4);
        pumpkin.toString();
        System.out.println("/n");
        pumpkin.fill("-");
        pumpkin.toString();



    }

}
