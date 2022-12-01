
package objects;


public class Company {
  public String RazaoSocial;
  public String cnpj;
  public String endereco;

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   //Método Construtor.
    
    public Company () {
        this.RazaoSocial = "";
        this.cnpj = "";
        this.endereco = "";
       
    }
    
    //Método Limpar Cliente
    
    public void LimparCompany () {
        this.setRazaoSocial ("");
        this.setCnpj ("");
        this.setEndereco ("");
        
        
    }
    
  
}

