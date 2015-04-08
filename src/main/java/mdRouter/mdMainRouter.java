package mdRouter;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdMainRouter {

    public mdMainRouter(String type, String name) {

//        System.out.println("Type  =  " + type);
//        System.out.println("Name  =  " + name);


//        switch (type){
//            case "see":
//                System.out.println(type + " is assertion and routed to assert router");
//                break;
//            default:
//                System.out.println("default ");
//                break;
//        }


        if (type.equals("see")) {
            System.out.println(type + " ASSERTION is detected");
        } else if (type.equals("click")) {
            System.out.println(type + " ACTION is detected");
        } else {
            System.out.println(" NOTHING  is detected");
        }


    }


}
