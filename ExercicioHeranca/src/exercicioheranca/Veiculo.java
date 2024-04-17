package exercicioheranca;

public class Veiculo {
    private String codVeiculo;
    private String MarcaVeiculo;
    private String ModeloVeiculo;
    
public String getCodVeiculo(){
    return codVeiculo;
    }

public String getMarcaVeiculo(){
    return MarcaVeiculo;
    
}

public String getModeloVeivulo(){
    return ModeloVeiculo;
}

public void setCodveivulo(String codVeivulo){
    this.codVeiculo = codVeivulo;
    System.out.println(codVeivulo);
}

public void setMarcaVeiculo(String MarcaVeivulo){
    this.MarcaVeiculo = MarcaVeivulo;
    System.out.println(MarcaVeivulo);
}

public void setModeloveiculo(String ModeloVeiculo){
    this.ModeloVeiculo = ModeloVeiculo;
    System.out.println(ModeloVeiculo);
}


}
