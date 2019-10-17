package permission;

public class Permission {

    public String permisionAdmin(String acesso){
       String permissoes[] = {"cadastros","consultas","relatorios","Pagamentos"};
        for (String p : permissoes) {
           if (acesso.equals(p)){
               return acesso;
           }
        }
        return "negado";
    }
    public void permisionPresidente(){

    }
    public void permisionSecrataria(){

    }
}
