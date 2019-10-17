package permission;

public class Permission {

    public static String permisionAdmin(String acesso){
       String permissoes[] = {"cadastros","consultas","relatorios","Pagamentos"};
        for (String p : permissoes) {
           if (acesso.equals(p)){
               return acesso;
           }
        }
        return "negado";
    }
    public static void permisionPresidente(){

    }
    public static void permisionSecrataria(){

    }
}
