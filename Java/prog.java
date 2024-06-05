public class prog {
    public static StringBuilder answer(String QUERY, String PARAMS){
    String QUERY = "select * from students where";
    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    String mod_PARAMS = PARAMS.replace("null", "");
        // .replace("\"", "")
        // .replace(":", "")
        // .replace(" ", "")
        // .replace("{", "");
    System.out.println(mod_PARAMS);
    }
    public static void main(String[] args) {
        //System.out.println(prog.mod_PARAMS);
    }
}
