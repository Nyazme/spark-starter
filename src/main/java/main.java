//server instructions


import static spark.Spark.*;


public class main {

    public static void main(String[] args) {
        staticFileLocation("/public");

        //get("/",(request, response)-> "What's up, Beta?");
        get("/", (request, response) -> {
            response.redirect("/index.html");
            return null;
        });


        get("/harmonyKitties", (req, res) -> {
            System.out.println("HARMONY KITTIES ARE MAGICAL!!!");
            return null;
        });
        //x
    }
}



