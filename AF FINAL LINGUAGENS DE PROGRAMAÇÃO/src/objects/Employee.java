package objects;

public class Employee {
    
    //Atributos Employee.
    
    public String nomeEmployee;
    public String cpfEmployee;
    public String sexoEmployee;
    public String nascimentoEmployee;
    public String cargoEmployee;
    public String admissaoEmployee;
    public String enderecoEmployee;
    public String cidadeEmployee;
    public String estadoEmployee;
    
    //Gets Employee.

    public String getNomeEmployee() {
        return nomeEmployee;
    }

    public String getCpfEmployee() {
        return cpfEmployee;
    }

    public String getSexoEmployee() {
        return sexoEmployee;
    }

    public String getNascimentoEmployee() {
        return nascimentoEmployee;
    }

    public String getCargoEmployee() {
        return cargoEmployee;
    }

    public String getAdmissaoEmployee() {
        return admissaoEmployee;
    }

    public String getEnderecoEmployee() {
        return enderecoEmployee;
    }

    public String getCidadeEmployee() {
        return cidadeEmployee;
    }

    public String getEstadoEmployee() {
        return estadoEmployee;
    }
    
    //Sets Employee.

    public void setNomeEmployee(String nomeEmployee) {
        this.nomeEmployee = nomeEmployee;
    }

    public void setCpfEmployee(String cpfEmployee) {
        this.cpfEmployee = cpfEmployee;
    }

    public void setSexoEmployee(String sexoEmployee) {
        this.sexoEmployee = sexoEmployee;
    }

    public void setNascimentoEmployee(String nascimentoEmployee) {
        this.nascimentoEmployee = nascimentoEmployee;
    }

    public void setCargoEmployee(String cargoEmployee) {
        this.cargoEmployee = cargoEmployee;
    }

    public void setAdmissaoEmployee(String admissaoEmployee) {
        this.admissaoEmployee = admissaoEmployee;
    }

    public void setEnderecoEmployee(String enderecoEmployee) {
        this.enderecoEmployee = enderecoEmployee;
    }

    public void setCidadeEmployee(String cidadeEmployee) {
        this.cidadeEmployee = cidadeEmployee;
    }

    public void setEstadoEmployee(String estadoEmployee) {
        this.estadoEmployee = estadoEmployee;
    }
    
    //Método Construtor.
    
    public Employee () {
        this.nomeEmployee = "";
        this.cpfEmployee = "";
        this.sexoEmployee = "";
        this.nascimentoEmployee = "";
        this.cargoEmployee = "";
        this.admissaoEmployee = "";
        this.enderecoEmployee = "";
        this.cidadeEmployee = "";
        this.estadoEmployee = "";
    }
    
    //Método Limpar Cliente
    
    public void LimparEmployee () {
        this.setNomeEmployee ("");
        this.setCpfEmployee ("");
        this.setSexoEmployee ("");
        this.setNascimentoEmployee ("");
        this.setCargoEmployee("");
        this.setAdmissaoEmployee ("");
        this.setEnderecoEmployee ("");
        this.setCidadeEmployee ("");
        this.setEstadoEmployee ("");
        
    }
    
}
