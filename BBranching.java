public class BBranching {
    public static void main(String[] args) {
        String userAcces = "user";
        String token = "";
        if (userAcces.equals("admin")) {
            System.out.println("Halo Admin");
        } else{
            System.out.println("Halo orang lain");
        }

        // if (userAcces.equals("admin")) {
        //     token = "token admin";
        // } else if(userAcces.equals("user")) {
        //     token = "token user";
        // } else{
        //     token = "default";
        // }
        // System.out.println(token);

        switch (userAcces) {
            case "admin":
                token = "token admin";
                break;
            case "user":
                token = "token user";
                break;
            default:
                token = "default";
                break;
        }
        System.out.println(token);


        // ternary
        int umur1 = 20;
        String hasilUmur = (umur1 < 17) ? "remaja" : "dewasa";
        System.out.println(hasilUmur);
    }
}
